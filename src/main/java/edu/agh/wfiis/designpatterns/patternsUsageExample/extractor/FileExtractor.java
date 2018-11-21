package edu.agh.wfiis.designpatterns.patternsUsageExample.extractor;

import edu.agh.wfiis.designpatterns.patternsUsageExample.extractor.Extractable;

import java.io.File;

public class FileExtractor implements Extractable {

    private File file;

    public void loadFile(File file){
        this.file = file;
    }

    @Override
    public String extractBadCode(){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from file";
    }
}
