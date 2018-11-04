package edu.agh.wfiis.designpatterns.designPatterns.comparator;

import edu.agh.wfiis.designpatterns.designPatterns.pattern.DesignPattern;

public class DesignPatternComparator {

    public boolean areSameType(DesignPattern first, DesignPattern second){
        return first.getType() == second.getType();
    }

}
