package edu.agh.wfiis.designpatterns.extractor;

public class FileExtractor implements Extractable {

    @Override
    public String extractBadCode(Object object){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from file";
    }
}
