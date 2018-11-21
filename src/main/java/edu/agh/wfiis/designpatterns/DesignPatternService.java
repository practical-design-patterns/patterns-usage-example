package edu.agh.wfiis.designpatterns;

import edu.agh.wfiis.designpatterns.patterns.DesignPattern;
import edu.agh.wfiis.designpatterns.extractor.ClassPathExtractor;
import edu.agh.wfiis.designpatterns.extractor.Extractable;
import edu.agh.wfiis.designpatterns.extractor.FileExtractor;
import edu.agh.wfiis.designpatterns.enums.PatternName;

import java.io.File;

public class DesignPatternService {

    private Extractable extractor;

    public String provideUsageExample(DesignPattern pattern){
        return pattern.getExample();
    }

    public String refactorCode(DesignPattern pattern, String badCode){
        return pattern.refactor(badCode);
    }

    public String listPatterns(){

        StringBuilder patternNames = new StringBuilder();

        for(PatternName patternName : PatternName.values())
        {
            patternNames.append(patternName.name());
        }

        return patternNames.toString();
    }

    public boolean areSameType(DesignPattern pattern1, DesignPattern pattern2){
        return pattern1.getDesignPatternType().equals(pattern2.getDesignPatternType());
    }

    public String extractBadCodeFromFile(File file){
        extractor = new FileExtractor();
        return extractor.extractBadCode(file);
    }

    public String extractBadCodeFromClassPath(ClassLoader classLoader){
        extractor = new ClassPathExtractor();
        return extractor.extractBadCode(classLoader);
    }

    public String generateDesignPatternsCourseworkForStudents(){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "very difficult coursework";
    }

}

