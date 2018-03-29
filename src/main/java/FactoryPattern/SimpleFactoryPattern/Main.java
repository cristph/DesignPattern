package FactoryPattern.SimpleFactoryPattern;

public class Main {

    public static void main(String[] args) {
        Product product=Factory.produce("ProductA");
        product.use();
        product=Factory.produce("ProductB");
        product.use();
    }
}