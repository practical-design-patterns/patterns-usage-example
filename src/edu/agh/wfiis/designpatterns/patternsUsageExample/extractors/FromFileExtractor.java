package edu.agh.wfiis.designpatterns.patternsUsageExample.extractors;
import java.io.File;

public class FromFileExtractor extends BadCodeExtractor
{
    private File _file;

    public FromFileExtractor(File file) {
        _file = file;
    }

    @Override public String extract() {
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from file";
    }
}
