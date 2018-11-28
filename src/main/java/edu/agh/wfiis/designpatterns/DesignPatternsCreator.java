package edu.agh.wfiis.designpatterns;

import edu.agh.wfiis.designpatterns.CreatableDesignPattern;
import edu.agh.wfiis.designpatterns.patterns.DesignPattern;

public class DesignPatternsCreator {

    public DesignPattern create(CreatableDesignPattern designPattern) {
        return designPattern.create();
    }
}
