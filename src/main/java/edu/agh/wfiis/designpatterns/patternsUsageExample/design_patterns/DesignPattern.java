package edu.agh.wfiis.designpatterns.patternsUsageExample.design_patterns;


public abstract class DesignPattern {
    public abstract String getName();

    public abstract Type getType();

    public abstract String getDescription();

    public abstract String getExample();

    public abstract RefactorProvider createRefactorProvider();

    public boolean isEqualType(DesignPattern designPattern) {
        return getType() == designPattern.getType();
    }

    public enum Type {
        CREATIONAL, BEHAVIORAL, STRUCTURAL
    }
}
