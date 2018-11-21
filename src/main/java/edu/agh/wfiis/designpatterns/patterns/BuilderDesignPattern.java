package edu.agh.wfiis.designpatterns.patterns;

import edu.agh.wfiis.designpatterns.CreatableDesignPattern;
import edu.agh.wfiis.designpatterns.enums.DesignPatternType;

public class BuilderDesignPattern implements CreatableDesignPattern {

    @Override
    public DesignPattern create() {

        return DesignPattern.builder()
                .withId("1")
                .withName("builder")
                .withDescription("builder pattern")
                .withExample(null)
                .withPatternCode(null)
                .withDesignPatternType(DesignPatternType.CREATIONAL)
                .build();

    }
}
