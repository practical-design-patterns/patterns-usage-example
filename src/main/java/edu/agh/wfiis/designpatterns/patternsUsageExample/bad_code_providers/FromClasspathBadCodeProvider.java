package edu.agh.wfiis.designpatterns.patternsUsageExample.bad_code_providers;

public class FromClasspathBadCodeProvider extends BadCodeProvider {
    @Override
    public String retrieveBadCode() {
        return "bad code";
    }
}
