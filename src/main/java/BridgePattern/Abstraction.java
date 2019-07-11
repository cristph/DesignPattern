package BridgePattern;

public abstract class Abstraction {

    public Implementor implementor;

    public abstract void operation();

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
}
