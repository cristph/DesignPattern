package FactoryPattern.SimpleFactoryPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public class Factory {

    public static Product produce(String productName){
        if(productName.equals("ProductA")){
            return new ConcreteProductA();
        }else if(productName.equals("ProductB")){
            return new ConcreteProductB();
        }
        return null;
    }
}
