package edu.agh.wfiis.designpatterns.designPatterns.factory;

import edu.agh.wfiis.designpatterns.designPatterns.pattern.DesignPattern;

public class DesignPatternFactory {

    private PatternTypesHandler patternTypesHandler = new PatternTypesHandler();

    DesignPattern createDesignPattern(PatternTypesHandler.Pattern name) {
        switch (name) {
            case BUILDER: {
                DesignPattern pattern = new DesignPattern.Builder()
                        .id("1")
                        .name("Builder")
                        .patternCode("code code code")
                        .description("description blah blah blah")
                        .example("example blah blah blah")
                        .type(patternTypesHandler.resolveType(name))
                        .build();
                return pattern;
            }
            case STATE: {
                DesignPattern pattern = new DesignPattern.Builder()
                        .id("2")
                        .name("State")
                        .patternCode("code code code")
                        .description("description blah blah blah")
                        .example("example blah blah blah")
                        .type(patternTypesHandler.resolveType(name))
                        .build();
                return pattern;
            }
            default: {
                throw new Error("Pattern with this name cannot be created, if you want to add new pattern, handle it in DesignPatternFactory class");
            }
        }
    }
}
