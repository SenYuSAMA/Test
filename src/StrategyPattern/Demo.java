package StrategyPattern;

public class Demo {
    public static void main(String[] args) {
        Context addContext = new Context(new AddStrategy());
        System.out.println("10+5::" + addContext.doSomething(10,5));

        Context mutyontext = new Context(new MultyStrategy());
        System.out.println("10X5::" + mutyontext.doSomething(10,5));
    }
}
