package edu.agh.wfiis.designpatterns.patternsUsageExample.factory;

public class BuilderFactory implements DesignPatternFactory {

    private DesignPattern designPattern;

    public BuilderFactory() {
        designPattern = DesignPattern.builder()
                .withName("builder")
                .withExample("some example")
                .withPatternCode("some code")
                .withType(new CreationalType())
                .build();
    }

    @Override
    public DesignPattern getDesignPattern() {
        return designPattern;
    }
}
