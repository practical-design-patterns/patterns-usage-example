package edu.agh.wfiis.designpatterns.patternsUsageExample;

import java.util.*;
import java.io.*;

public class DesignPatternsManager implements Serializable {


    private static volatile DesignPatternsManager instance;
    private Map<String, DesignPattern> patterns = new HashMap<String, DesignPattern>();

    public DesignPattern create(String patternName) {
         return patterns.get(patternName);
    }

    public static DesignPatternsManager getInstance() {
        if (instance == null) {
            instance = new DesignPatternsManager();
        }
        return instance;
    }

    private DesignPatternsManager() {
        if (instance != null) {
            throw new IllegalStateException("Cannot create new instance, please use getInstance method instead.");
        }
        patterns.put("BUILDER", DesignPattern.builder("1", "builder").withDescription("builder pattern").withExample(null).withPatternCode(null).build());
        patterns.put("DECORATOR", DesignPattern.builder("2", "decorator").withDescription("decorator pattern").withExample(null).withPatternCode(null).build());
        patterns.put("STRATEGY", DesignPattern.builder("3", "strategy").withDescription("strategy pattern").withExample(null).withPatternCode(null).build());
    }

    @Override
    public DesignPatternsManager clone() throws CloneNotSupportedException {
        return getInstance();
    }

    public String provideUsageExample(DesignPattern pattern){
        return pattern.getExample();
    }

    public String refactorCode(DesignPattern pattern, String badCode){
        return pattern.refactor(badCode);
    }

    public String[] listPatterns(){
        return patterns.keySet().toArray(new String[patterns.size()]);
    }

    public boolean areSameType(DesignPattern pattern1, DesignPattern pattern2){
        return pattern1.getPatternType() == pattern2.getPatternType();
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

    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }


}
