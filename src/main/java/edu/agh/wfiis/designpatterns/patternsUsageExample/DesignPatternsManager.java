package edu.agh.wfiis.designpatterns.patternsUsageExample;

import edu.agh.wfiis.designpatterns.patternsUsageExample.extractor.ClassPathExtractor;
import edu.agh.wfiis.designpatterns.patternsUsageExample.extractor.Extractable;
import edu.agh.wfiis.designpatterns.patternsUsageExample.extractor.FileExtractor;

import java.io.File;

public class DesignPatternsManager {

    private Extractable fileExtractor, classPathExtractor;

    public DesignPattern create(PatternName patternName) {
        switch (patternName) {
            case BUILDER: {
                DesignPattern pattern = DesignPattern.builder()
                        .withId("1")
                        .withName("builder")
                        .withDescription("builder pattern")
                        .withExample(null)
                        .withPatternCode(null)
                        .withDesignPatternType(DesignPatternType.CREATIONAL)
                        .build();
                return pattern;
            }
            case DECORATOR: {
                DesignPattern pattern = DesignPattern.builder()
                        .withId("2")
                        .withName("decorator")
                        .withDescription("decorator pattern")
                        .withExample(null)
                        .withPatternCode(null)
                        .withDesignPatternType(DesignPatternType.CREATIONAL)
                        .build();
                return pattern;
            }
            case STRATEGY: {
                DesignPattern pattern = DesignPattern.builder()
                        .withId("3")
                        .withName("strategy")
                        .withDescription("strategy pattern")
                        .withExample(null)
                        .withPatternCode(null)
                        .withDesignPatternType(DesignPatternType.BEHAVIORAL)
                        .build();
                return pattern;
            }
            default: {
                DesignPattern pattern = new UndefinedPattern();
                return pattern;
            }
        }
    }

    public String provideUsageExample(DesignPattern pattern){
        String example = pattern instanceof UndefinedPattern? null: pattern.getExample();
        return example;
    }

    public String refactorCode(DesignPattern pattern, String badCode){
        String goodCode = pattern instanceof UndefinedPattern? null: pattern.refactor(badCode);
        return goodCode;
    }

    public String listPatterns(){
        return PatternName.values().toString();
    }

    public boolean areSameType(DesignPattern pattern1, DesignPattern pattern2){
        return pattern1.getDesignPatternType().equals(pattern2.getDesignPatternType());
    }

    public String extractBadCodeFromFile(File file){
        fileExtractor = new FileExtractor();
        return fileExtractor.extractBadCode(file);
    }

    public String extractBadCodeFromClassPath(ClassLoader classLoader){
        classPathExtractor = new ClassPathExtractor();
        return classPathExtractor.extractBadCode(classLoader);
    }

    public String generateDesignPatternsCourseworkForStudents(){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "very difficult coursework";
    }

}

enum PatternName {
    BUILDER, DECORATOR, STRATEGY
}


class UndefinedPattern extends DesignPattern {

    public UndefinedPattern() {
        super();
    }

    public String refactor(String badCode){
        throw new UnsupportedOperationException();
    }

}