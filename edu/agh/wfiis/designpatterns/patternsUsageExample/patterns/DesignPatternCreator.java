package edu.agh.wfiis.designpatterns.patternsUsageExample.patterns;

import edu.agh.wfiis.designpatterns.patternsUsageExample.enums.Pattern;

public abstract class DesignPatternCreator
{
    public abstract DesignPattern create(Pattern pattern);
}