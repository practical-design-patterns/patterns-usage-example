package edu.agh.wfiis.designpatterns.patternsUsageExample;

import org.springframework.stereotype.Component;

public class DesignPattern {
    private Details patternDetails;

    private String patternCode;

    public static DesignPattern create(CreatingDesignPattern creator) {
        return creator.create();
    }

    public Details getPatternDetails() {
        return patternDetails;
    }

    public String refactor(String badCode){
        /* some magic involving patternCode happens here, irrelevant from this example perspective...*/

        String goodCode = "this code is very good";
        return goodCode;
    }

    private DesignPattern(Details patternDetails, String patternCode) {
        this.patternDetails = patternDetails;
        this.patternCode = patternCode;
    }

    @Component
    public static class Builder implements CreatingDesignPattern, HavingName {
        @Override
        public DesignPattern create() {
            return new DesignPattern(
                    new Details("1", name(), "builder pattern", "some builder example", Type.CREATIONAL),
                    "some builder code"
            );
        }

        @Override
        public String name() {
            return "builder";
        }
    }

    @Component
    public static class Decorator implements CreatingDesignPattern, HavingName {
        @Override
        public DesignPattern create() {
            return new DesignPattern(
                    new Details("2", name(), "decorator pattern", "some decorator example", Type.CREATIONAL),
                    "some decorator code"
            );
        }

        @Override
        public String name() {
            return "decorator";
        }
    }

    @Component
    public static class Strategy implements CreatingDesignPattern, HavingName {
        @Override
        public DesignPattern create() {
            return new DesignPattern(
                    new Details("3", name(), "strategy pattern", "some strategy example", Type.BEHAVIORAL),
                    "some strategy code"
            );
        }

        @Override
        public String name() {
            return "strategy";
        }
    }

    private enum Type {
        CREATIONAL, STRUCTURAL, BEHAVIORAL
    }

     static class Details {
        private String id;
        private String name;
        private String description;
        private String example;
        private Type patternType;

        private Details(String id, String name, String description, String example, DesignPattern.Type patternType) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.example = example;
            this.patternType = patternType;
        }

        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getExample() {
            return example;
        }

        public Type getPatternType() {
            return patternType;
        }
    }
}
