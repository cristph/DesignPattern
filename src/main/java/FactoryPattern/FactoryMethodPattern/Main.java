package FactoryPattern.FactoryMethodPattern;

public class Main {

    public static void main(String[] args) {
        Factory factory=new ConcreteFactory();
        Product product=factory.produce();
        product.use();
    }
}