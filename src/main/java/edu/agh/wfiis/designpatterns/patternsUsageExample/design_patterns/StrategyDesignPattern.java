package edu.agh.wfiis.designpatterns.patternsUsageExample.design_patterns;

public class StrategyDesignPattern extends DesignPattern {
    StrategyDesignPattern(){}

    @Override
    public String getName() {
        return "Strategy";
    }

    @Override
    public Type getType() {
        return Type.BEHAVIORAL;
    }

    @Override
    public String getDescription() {
        return "some strategy desc";
    }

    @Override
    public String getExample() {
        return "some strategy example";
    }

    @Override
    public RefactorProvider createRefactorProvider() {
        return badCode -> badCode + " now improved with Strategy DP";
    }
}
