package BuilderPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public class ConcreteBuilder implements Builder {

    Product product=new Product();

    public void buildPartA() {
        product.setA("A");
    }

    public void buildPartB() {
        product.setB("B");
    }

    public void buildPartC() {
        product.setC("C");
    }

    public Product getProduct() {
        return product;
    }
}
