package edu.agh.wfiis.designpatterns.patternsUsageExample.design_patterns;

public class DecoratorDesignPattern extends DesignPattern {
    DecoratorDesignPattern(){}

    @Override
    public String getName() {
        return "Decorator";
    }

    @Override
    public Type getType() {
        return Type.STRUCTURAL;
    }

    @Override
    public String getDescription() {
        return "some decorator desc";
    }

    @Override
    public String getExample() {
        return "some decorator example";
    }

    @Override
    public RefactorProvider createRefactorProvider() {
        return badCode -> badCode + " now improved with Decorator DP";
    }
}
