package BuilderPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public class Director {

    Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder=builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
