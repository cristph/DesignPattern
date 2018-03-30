package BuilderPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public interface Builder {

    public void buildPartA();
    public void buildPartB();
    public void buildPartC();
    public Product getProduct();
}
