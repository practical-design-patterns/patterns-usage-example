package edu.agh.wfiis.designpatterns.designPatterns.badCodeExtractor;

import java.io.File;

public class BadCodeExtractor {

    public String extractBadCodeFromFile(File file){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from file";
    }

    public String extractBadCodeFromClassPath(ClassLoader classLoader){
        /* some magic happens here, irrelevant from this example perspective...*/
        return "bad code from class loader";
    }
}
