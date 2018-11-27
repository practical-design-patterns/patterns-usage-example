package edu.agh.wfiis.designpatterns.patternsUsageExample.extractors;

public class FromClassPathExtractor extends BadCodeExtractor
{
    private ClassLoader _classLoader;

    public FromClassPathExtractor(ClassLoader classLoader) {
        _classLoader = classLoader;
    }

    @Override public String extract() {
	  /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from class loader";
    }
}
