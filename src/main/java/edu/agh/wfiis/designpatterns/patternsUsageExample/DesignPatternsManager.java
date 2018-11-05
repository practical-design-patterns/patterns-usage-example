package edu.agh.wfiis.designpatterns.patternsUsageExample;

import edu.agh.wfiis.designpatterns.patternsUsageExample.extractor.BadCodeExtractor;
import edu.agh.wfiis.designpatterns.patternsUsageExample.extractor.FromClassLoaderExtractor;
import edu.agh.wfiis.designpatterns.patternsUsageExample.extractor.FromFileExtractor;
import edu.agh.wfiis.designpatterns.patternsUsageExample.factory.*;
import edu.agh.wfiis.designpatterns.patternsUsageExample.generator.CourseworkGenerator;
import edu.agh.wfiis.designpatterns.patternsUsageExample.generator.DesignPatternsCourseworkGenerator;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DesignPatternsManager {

    private final BadCodeExtractor fileExtractor = new FromFileExtractor();
    private final BadCodeExtractor classLoaderExtractor = new FromClassLoaderExtractor();
    private final CourseworkGenerator courseworkGenerator = new DesignPatternsCourseworkGenerator();


    public DesignPattern create(DesignPatternFactory designPatternFactory) {
        return designPatternFactory.getDesignPattern();
    }

    public String provideUsageExample(DesignPattern pattern) {
        return pattern.getExample();
    }

    public String refactorCode(Refactorable pattern, String badCode) {
        return pattern.refactor(badCode);
    }

    public String listPatterns(Set<DesignPatternFactory> designPatternFactorySet) {
        return String.join(", ", designPatternFactorySet
                .stream()
                .map(designPatternFactory -> designPatternFactory.getDesignPattern().getName())
                .collect(Collectors.toList()));
    }

    public boolean areSameType(DesignPattern pattern1, DesignPattern pattern2) {
        return pattern1.isSameType(pattern2);
    }

    public String extractBadCodeFromFile(File file) {
        return fileExtractor.extract(file);
    }

    public String extractBadCodeFromClassPath(ClassLoader classLoader) {
        return classLoaderExtractor.extract(classLoader);
    }

    public String generateDesignPatternsCourseworkForStudents() {
        return courseworkGenerator.generate();
    }

    public static void main(String[] args) {
        DesignPatternsManager designPatternsManager = new DesignPatternsManager();

        DesignPatternFactory builderFactory = new BuilderFactory();
        DesignPatternFactory decoratorFactory = new DecoratorFactory();
        DesignPatternFactory strategyFactory = new StrategyFactory();

        Set<DesignPatternFactory> designPatternFactorySet = new HashSet<>(Arrays.asList(builderFactory,
                decoratorFactory, strategyFactory));

        System.out.println(designPatternsManager.listPatterns(designPatternFactorySet));

        DesignPattern builder = designPatternsManager.create(builderFactory);
        designPatternsManager.refactorCode(builder, "bad code");

        System.out.println("Builder type: " + builder.getType());
    }
}
