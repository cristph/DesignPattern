package FactoryPattern.FactoryMethodPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public class ConcreteFactory extends Factory {

    public Product produce() {
        return new ConcreteProduct();
    }
}
