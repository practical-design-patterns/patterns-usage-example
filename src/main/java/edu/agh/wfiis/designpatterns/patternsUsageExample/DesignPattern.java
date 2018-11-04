package edu.agh.wfiis.designpatterns.patternsUsageExample;

public class DesignPattern {

    private String id;

    private String name;

    private String patternCode;

    private String description;

    private String example;

    private String patternType;

    private DesignPattern(){}

    public String getId() { return id; }

    public String getName() { return name; }

    public String getDescription() { return description; }

    public String getExample() { return example; }

    public String getPatternType() { return patternType; }

    public String getPatternCode() { return patternCode; }

    public String refactor(String badCode){
        /* some magic involving patternCode happens here, irrelevant from this example perspective...*/

        String goodCode = "this code is very good";
        return goodCode;
    }

    public static Builder builder(String id, String name) {
        return new Builder(id, name);
    }


    private static class Builder {

        private String id;

        private String name;

        private String patternCode;

        private String description;

        private String example;

        private String patternType;

        Builder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder withDescription(String description){
            this.description = description;
            return this;
        }

        public Builder withPatternCode(String patternCode){
            this.patternCode = patternCode;
            return this;
        }

        public Builder withExample(String example){
            this.example = example;
            return this;
        }

        public Builder withPatternType(String patternType){
            this.patternType = patternType;
            return this;
        }

        public DesignPattern build(){
            DesignPattern designPattern = new DesignPattern();
            designPattern.id = id;
            designPattern.name = name;
            designPattern.description = description;
            designPattern.example = example;
            designPattern.patternCode = patternCode;
            designPattern.patternType = patternType;
            return designPattern;
        }
    }

}
