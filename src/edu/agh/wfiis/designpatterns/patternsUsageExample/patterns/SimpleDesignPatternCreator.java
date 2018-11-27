package edu.agh.wfiis.designpatterns.patternsUsageExample.patterns;
import edu.agh.wfiis.designpatterns.patternsUsageExample.enums.DesignPatternType;
import edu.agh.wfiis.designpatterns.patternsUsageExample.enums.Pattern;

public class SimpleDesignPatternCreator extends DesignPatternCreator
{

    public static String listAvailablePatterns()
    {
        return Pattern.values().toString();
    }

    @Override public DesignPattern create(Pattern pattern)
    {
        switch (pattern)
        {
            case BUILDER:
            {
                return new DesignPattern.Builder("builder", "builder pattern code", DesignPatternType.CREATIONAL)
                        .withDescription("builder description")
                        .build();
            }
            case DECORATOR:
            {
                return new DesignPattern.Builder("decorator", "decorator pattern code", DesignPatternType.STRUCTURAL)
                        .withDescription("decorator description")
                        .withExample("decorator example")
                        .build();
            }
            case STRATEGY:
            {
                return new DesignPattern.Builder("strategy", "strategy pattern code", DesignPatternType.BEHAVIORAL)
                        .build();
            }
            default:
            {
                return new DesignPattern.Builder(null, null, null).build();
            }
        }
    }
}

