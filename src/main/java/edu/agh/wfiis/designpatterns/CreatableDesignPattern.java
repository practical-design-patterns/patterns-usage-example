package edu.agh.wfiis.designpatterns;

import edu.agh.wfiis.designpatterns.patterns.DesignPattern;

public interface CreatableDesignPattern {

    DesignPattern create(CreatableDesignPattern designPattern);
}
