package edu.agh.wfiis.designpatterns.patternsUsageExample.patterns;

import edu.agh.wfiis.designpatterns.patternsUsageExample.enums.DesignPatternType;
import edu.agh.wfiis.designpatterns.patternsUsageExample.enums.Pattern;

public class DesignPattern {

    private String name;
    private String patternCode;
    private String description;
    private String example;

    private DesignPatternType type;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getExample() {
        return example;
    }

    public String getPatternCode() {
        return patternCode;
    }

    public DesignPatternType getType() {
        return type;
    }
	
	public boolean isTheSameTypeAs(DesignPattern patternToCompare) {
		return type == patternToCompare.getType();
	}
	
    private DesignPattern(DesignPattern.Builder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.example = builder.example;
        this.patternCode = builder.patternCode;
        this.type = builder.type;
    }

    public static class Builder {
        private String name;
        private String patternCode;
        private String description;
        private String example;

        private DesignPatternType type;

        public Builder(String name, String patternCode, DesignPatternType type){
            this.name = name;
            this.patternCode = patternCode;
            this.type = type;
        }

        public Builder withDescription(String description){
            this.description = description;
            return this;
        }

        public Builder withExample(String example){
            this.example = example;
            return this;
        }

        public DesignPattern build(){
            return new DesignPattern(this);
        }

    }


}