package edu.agh.wfiis.designpatterns.patternsUsageExample.factory;

public class DesignPattern implements Refactorable {

    private String name;
    private String patternCode;
    private String example;
    private DesignPatternType type;

    private DesignPattern(Builder builder) {
        this(builder.name, builder.patternCode, builder.example, builder.type);
    }

    private DesignPattern(String name, String patternCode, String example, DesignPatternType type) {
        this.name = name;
        this.patternCode = patternCode;
        this.example = example;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getPatternCode() {
        return this.patternCode;
    }

    public String getExample() {
        return this.example;
    }

    public DesignPatternType getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatternCode(String patternCode) {
        this.patternCode = patternCode;
    }

    public void setExample(String example) {
        this.example = example;
    }

    static Builder builder() {
        return new Builder();
    }

    public boolean isSameType(DesignPattern designPattern) {
        return type.equals(designPattern.type);
    }

    @Override
    public String refactor(String badCode) {
        /* some magic involving patternCode happens here, irrelevant from this example perspective...*/

        return "this code is very good";
    }

    static class Builder {
        private String name;
        private String patternCode;
        private String example;
        private DesignPatternType type;

        Builder withName(String name) {
            this.name = name;
            return this;
        }

        Builder withPatternCode(String patternCode) {
            this.patternCode = patternCode;
            return this;
        }

        Builder withExample(String example) {
            this.example = example;
            return this;
        }

        Builder withType(DesignPatternType type) {
            this.type = type;
            return this;
        }

        DesignPattern build() {
            return new DesignPattern(this);
        }
    }
}
