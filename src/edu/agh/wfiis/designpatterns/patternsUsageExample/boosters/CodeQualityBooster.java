package edu.agh.wfiis.designpatterns.patternsUsageExample.boosters;

import edu.agh.wfiis.designpatterns.patternsUsageExample.patterns.DesignPattern;

public class CodeQualityBooster {

    public static String refactorCode(DesignPattern pattern, String badCode){
        if (pattern.getPatternCode() == null)
            throw new UnsupportedOperationException();
        /* some magic involving patternCode happens here, irrelevant from this example perspective...*/
        String goodCode = "this code is very good";
        return goodCode;
    }
}
