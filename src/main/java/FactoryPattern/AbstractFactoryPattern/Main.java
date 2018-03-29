package FactoryPattern.AbstractFactoryPattern;

public class Main {

    public static void main(String[] args) {
        Factory factory1=new ConcreteFactory1();
        ProductA productA1=factory1.produceProductA();
        productA1.use();

        Factory factory2=new ConcreteFactory2();
        ProductB productB2=factory2.produceProductB();
        productB2.use();
    }
}