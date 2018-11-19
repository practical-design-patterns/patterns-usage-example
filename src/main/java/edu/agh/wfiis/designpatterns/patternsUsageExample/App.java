package edu.agh.wfiis.designpatterns.patternsUsageExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(App.class);
        performExample();
    }

    private static void performExample() {
        DesignPatternsManager manager = (DesignPatternsManager) applicationContext.getBean("designPatternsManager");

        CreatingDesignPattern builderCreator = (DesignPattern.Builder) applicationContext.getBean("designPattern.Builder");
        CreatingDesignPattern decoratorCreator = (DesignPattern.Decorator) applicationContext.getBean("designPattern.Decorator");
        CreatingDesignPattern strategyCreator = (DesignPattern.Strategy) applicationContext.getBean("designPattern.Strategy");

        DesignPattern builder = DesignPattern.create(builderCreator);
        DesignPattern decorator = DesignPattern.create(decoratorCreator);
        DesignPattern strategy = DesignPattern.create(strategyCreator);

        String refactoredCode = manager.using(builder).refactorCode("if(someBoolean == true) {...}");
        System.out.println("After refactor: " + refactoredCode);

        Boolean isSameType = manager.using(decorator).checkIfSameType(builder);
        System.out.println("Are same types? " + (isSameType ? "yes" : "no"));

        String example = manager.using(strategy).provideUsageExample();
        System.out.println("Strategy example: " + example);

        String patternsList = manager.listPatterns();
        System.out.println("Patterns list: \n" + patternsList);
    }
}
