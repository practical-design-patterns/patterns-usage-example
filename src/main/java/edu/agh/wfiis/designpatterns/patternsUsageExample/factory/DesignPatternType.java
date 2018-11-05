package edu.agh.wfiis.designpatterns.patternsUsageExample.factory;

interface DesignPatternType {
    String toString(); 
}

class CreationalType implements DesignPatternType {
    @Override
    public String toString() {return "creational";}
}

class StructuralType implements DesignPatternType {
    @Override
    public String toString() {return "structural";}
}

class BehavioralType implements DesignPatternType {
    @Override
    public String toString() {return "behavioral";}
}
