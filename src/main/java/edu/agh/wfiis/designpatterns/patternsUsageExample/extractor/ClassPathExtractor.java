package edu.agh.wfiis.designpatterns.patternsUsageExample.extractor;

public class ClassPathExtractor implements Extractable {

    @Override
    public String extractBadCode(Object object){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from class loader";
    }
}
