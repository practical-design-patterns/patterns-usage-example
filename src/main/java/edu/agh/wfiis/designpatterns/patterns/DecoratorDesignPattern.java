package edu.agh.wfiis.designpatterns.patterns;

import edu.agh.wfiis.designpatterns.CreatableDesignPattern;
import edu.agh.wfiis.designpatterns.enums.DesignPatternType;

public class DecoratorDesignPattern implements CreatableDesignPattern {

    @Override
    public DesignPattern create() {

        return DesignPattern.builder()
                .withId("2")
                .withName("decorator")
                .withDescription("decorator pattern")
                .withExample(null)
                .withPatternCode(null)
                .withDesignPatternType(DesignPatternType.CREATIONAL)
                .build();
    }

}
