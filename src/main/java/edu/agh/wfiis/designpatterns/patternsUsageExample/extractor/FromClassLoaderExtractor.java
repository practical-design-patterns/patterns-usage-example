package edu.agh.wfiis.designpatterns.patternsUsageExample.extractor;

public class FromClassLoaderExtractor implements BadCodeExtractor {

    @Override
    public String extract(Object object) {
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from class loader";
    }
}
