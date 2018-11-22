package edu.agh.wfiis.designpatterns.patternsUsageExample;

import edu.agh.wfiis.designpatterns.patternsUsageExample.boosters.CodeQualityBooster;
import edu.agh.wfiis.designpatterns.patternsUsageExample.enums.Pattern;
import edu.agh.wfiis.designpatterns.patternsUsageExample.extractors.BadCodeExtractor;
import edu.agh.wfiis.designpatterns.patternsUsageExample.extractors.FromFileExtractor;
import edu.agh.wfiis.designpatterns.patternsUsageExample.patterns.DesignPattern;
import edu.agh.wfiis.designpatterns.patternsUsageExample.patterns.SimpleDesignPatternCreator;

import java.io.File;

public class Main
{
    public static void main(String[] args)
    {
        BadCodeExtractor extractor = new FromFileExtractor(new File("someString"));
        String badCode = extractor.extract();

        /*
        some good quality code here
         */

        SimpleDesignPatternCreator simpleDesignPatternCreator = new SimpleDesignPatternCreator();
        DesignPattern designPattern = simpleDesignPatternCreator.create(Pattern.BUILDER);

        /*
        even better quality code here
         */

        String goodCode = CodeQualityBooster.refactorCode(designPattern, badCode);
        System.out.println(goodCode);
    }
}
