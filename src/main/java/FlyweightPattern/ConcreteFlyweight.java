package FlyweightPattern;

public class ConcreteFlyweight implements FlyWeight {

    private String name;

    public ConcreteFlyweight(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println(new StringBuilder(name)
                .append(" do operation").toString());
    }
}
