package edu.agh.wfiis.designpatterns.patternsUsageExample.extractor;

public class ClassPathExtractor implements Extractable {

    private ClassLoader classLoader;

    public void loadClassLoader(ClassLoader classLoader) {this.classLoader=classLoader;}

    @Override
    public String extractBadCode(){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from class loader";
    }
}
