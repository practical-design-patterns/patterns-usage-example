package edu.agh.wfiis.designpatterns.patternsUsageExample.factory;

public class StrategyFactory implements DesignPatternFactory {

    private DesignPattern designPattern;

    public StrategyFactory() {
        designPattern = DesignPattern.builder()
                .withName("strategy")
                .withExample("some example")
                .withPatternCode("some code")
                .withType(new BehavioralType())
                .build();
    }

    @Override
    public DesignPattern getDesignPattern() {
        return designPattern;
    }
}
