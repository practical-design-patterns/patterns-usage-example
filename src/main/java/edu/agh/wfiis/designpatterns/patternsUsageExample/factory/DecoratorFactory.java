package edu.agh.wfiis.designpatterns.patternsUsageExample.factory;

public class DecoratorFactory implements DesignPatternFactory {

    private DesignPattern designPattern;

    public DecoratorFactory() {
        designPattern = DesignPattern.builder()
                .withName("decorator")
                .withExample("some example")
                .withPatternCode("some code")
                .withType(new StructuralType())
                .build();
    }

    @Override
    public DesignPattern getDesignPattern() {
        return designPattern;
    }
}
