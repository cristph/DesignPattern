package FactoryPattern.AbstractFactoryPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public class ConcreteFactory2 extends Factory {
    public ProductA produceProductA() {
        return new ProductA2();
    }

    public ProductB produceProductB() {
        return new ProductB2();
    }
}
