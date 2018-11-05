package edu.agh.wfiis.designpatterns.patternsUsageExample.design_patterns;


import java.util.HashMap;
import java.util.Map;

public class DesignPatternFactory {
    public static class DesignPatternNotRegisteredException extends Exception {
        DesignPatternNotRegisteredException(String s) {
            super(s);
        }
    }

    private static Map<String, DesignPattern> registeredDesignPatterns = new HashMap<>();

    static {
        registerDesignPattern(new BuilderDesignPattern());
        registerDesignPattern(new DecoratorDesignPattern());
        registerDesignPattern(new StrategyDesignPattern());
    }

    private static void registerDesignPattern(DesignPattern designPattern) {
        registeredDesignPatterns.put(designPattern.getName(), designPattern);
    }

    public static DesignPattern create(String patternName) throws DesignPatternNotRegisteredException {
        DesignPattern designPattern = registeredDesignPatterns.get(patternName);
        if (null != designPattern) {
            return designPattern;
        } else {
            throw new DesignPatternNotRegisteredException(patternName + " not registered");
        }
    }

}
