package edu.agh.wfiis.designpatterns.patternsUsageExample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DesignPatternsManager {
    private final Set<HavingName> patternNames;

    @Autowired
    public DesignPatternsManager(Set<HavingName> patternNames) {
        this.patternNames = patternNames;
    }

    public PatternHandler using(DesignPattern designPattern) {
        return new PatternHandler(designPattern);
    }

    public String listPatterns(){
        return patternNames.stream()
                           .map(HavingName::name)
                           .collect(Collectors.joining("\n"));
    }

    public String extractBadCodeFromFile(File file){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from file";
    }

    public String extractBadCodeFromClassPath(ClassLoader classLoader){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from class loader";
    }

    public String generateDesignPatternsCourseworkForStudents(){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "very difficult coursework";
    }

    static class PatternHandler {
        private DesignPattern designPattern;

        public String provideUsageExample(){
            return designPattern.getPatternDetails().getExample();
        }

        public String refactorCode(String badCode){
            return designPattern.refactor(badCode);
        }

        public boolean checkIfSameType(DesignPattern otherPattern){
            return Objects.equals(designPattern.getPatternDetails().getPatternType(), otherPattern.getPatternDetails().getPatternType());
        }

        private PatternHandler(DesignPattern designPattern) {
            this.designPattern = designPattern;
        }
    }
}

