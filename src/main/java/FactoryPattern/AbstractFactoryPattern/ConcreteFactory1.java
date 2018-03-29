package FactoryPattern.AbstractFactoryPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public class ConcreteFactory1 extends Factory {
    public ProductA produceProductA() {
        return new ProductA1();
    }

    public ProductB produceProductB() {
        return new ProductB1();
    }
}
