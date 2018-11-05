package edu.agh.wfiis.designpatterns.designPatterns.factory;

public class PatternTypesHandler {

    protected enum Pattern {

        BUILDER (Group.CREATIONAL),
        SINGLETON (Group.CREATIONAL),

        ADAPTER (Group.STRUCTURAL),
        BRIDGE (Group.STRUCTURAL),

        STATE (Group.BEHAVIORAL);

        private Group group;

        Pattern(Group group) {
            this.group = group;
        }

        public boolean isInGroup(Group group) {
            return this.group == group;
        }

        public enum Group {
            CREATIONAL,
            STRUCTURAL,
            BEHAVIORAL,
        }
    }

    public String listPatterns() {
       /* loop through enum, concatenate string */
       return "Full list of patterns";
    }

    public String resolveType(Pattern type){
        if(type.isInGroup(Pattern.Group.CREATIONAL)) {
            return "Creational";
        }
        if(type.isInGroup(Pattern.Group.STRUCTURAL)) {
            return "Structural";
        }
        if(type.isInGroup(Pattern.Group.BEHAVIORAL)) {
            return "Behavioral";
        }
        throw new Error("No type specified for this design pattern, checkout pattern types in PatternTypesHandler");
    }

}
