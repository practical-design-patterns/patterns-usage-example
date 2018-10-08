package edu.agh.wfiis.designpatterns.patternsUsageExample;

class DesignPattern {

    private String id;

    private String name;

    private String description;

    private String example;

    private boolean creational;

    private boolean structural;

    private boolean behavioral;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public boolean isCreational() {
        return creational;
    }

    public void setCreational(boolean creational) {
        this.creational = creational;
    }

    public boolean isStructural() {
        return structural;
    }

    public void setStructural(boolean structural) {
        this.structural = structural;
    }

    public boolean isBehavioral() {
        return behavioral;
    }

    public void setBehavioral(boolean behavioral) {
        this.behavioral = behavioral;
    }


    public DesignPattern(String id, String name, String description, String example, boolean creational, boolean structural, boolean behavioral) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.example = example;
        this.creational = creational;
        this.structural = structural;
        this.behavioral = behavioral;
    }

    public String refactor(String badCode){
        /* some magic happens here, irrelevant from this example perspective...*/

        String goodCode = "this code is very good";
        return goodCode;
    }
}
