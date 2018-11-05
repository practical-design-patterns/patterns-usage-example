package edu.agh.wfiis.designpatterns.patternsUsageExample.design_patterns;

public class BuilderDesignPattern extends DesignPattern {
    @Override
    public String getName() {
        return "Builder";
    }

    @Override
    public Type getType() {
        return Type.CREATIONAL;
    }

    @Override
    public String getDescription() {
        return "some builder desc";
    }

    @Override
    public String getExample() {
        return "some builder example";
    }

    @Override
    public RefactorProvider createRefactorProvider() {
        return badCode -> badCode + " now improved with Builder DP";
    }
}
