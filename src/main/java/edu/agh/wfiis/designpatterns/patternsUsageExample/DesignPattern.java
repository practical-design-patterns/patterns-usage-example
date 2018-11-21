package edu.agh.wfiis.designpatterns.patternsUsageExample;

class DesignPattern {

    private String id;
    private String name;
    private String description;
    private String example;
    private String patternCode;
    private DesignPatternType designPatternType;

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

    public DesignPatternType getDesignPatternType() {
        return designPatternType;
    }

    public String getPatternCode() {
        return patternCode;
    }

    protected DesignPattern() {

    }

    private DesignPattern(String id, String name, String description, String example, String patternCode, DesignPatternType designPatternType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.example = example;
        this.patternCode = patternCode;
        this.designPatternType = designPatternType;
    }

    public String refactor(String badCode){
        /* some magic involving patternCode happens here, irrelevant from this example perspective...*/

        String goodCode = "this code is very good";
        return goodCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private String id;
        private String name;
        private String description;
        private String example;
        private String patternCode;
        private DesignPatternType designPatternType;

        public Builder from(DesignPattern designPattern) {
             this.id = designPattern.getId();
             this.name = designPattern.getName();
             this.description = designPattern.getDescription();
             this.example = designPattern.getExample();
             this.patternCode = designPattern.getPatternCode();
             this.designPatternType = designPattern.getDesignPatternType();

             return this;
        }

        public Builder withId(String id) {
            this.id = id;

            return this;
        }

        public Builder withName(String name) {
            this.name = name;

            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;

            return this;
        }

        public Builder withExample(String example) {
            this.example = example;

            return this;
        }

        public Builder withPatternCode(String patternCode) {
            this.patternCode = patternCode;

            return this;
        }

        public Builder withDesignPatternType(DesignPatternType designPatternType) {
            this.designPatternType = designPatternType;

            return this;
        }

        public DesignPattern build() {
            return new DesignPattern(id, name, description, example, patternCode, designPatternType);
        }
    }
}
