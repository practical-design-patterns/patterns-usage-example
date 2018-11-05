package edu.agh.wfiis.designpatterns.designPatterns.pattern;

public class DesignPattern implements IDesignPattern {

    private String id;
    private String name;
    private String patternCode;
    private String description;
    private String example;
    private String type;

    public String getExample() {
        return this.example;
    }

    public String getType() {
        return this.type;
    }

    public String refactor() {
        return "beautiful code";
    }

    private DesignPattern(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.patternCode = builder.patternCode;
        this.description = builder.description;
        this.example = builder.example;
        this.type = builder.type;
    }

    public static class Builder {
        private String id;
        private String name;
        private String patternCode;
        private String description;
        private String example;
        private String type;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder patternCode(String patternCode){
            this.patternCode = patternCode;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Builder example(String example){
            this.example = example;
            return this;
        }

        public Builder type(String type){
            this.type = type;
            return this;
        }

        public DesignPattern build(){
            return new DesignPattern(this);
        }

    }

}