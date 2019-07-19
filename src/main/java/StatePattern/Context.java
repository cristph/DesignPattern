package StatePattern;

/**
 * @author cristph
 * @date 2019-07-19 09:49
 */

public class Context {

    private State state;

    public Context (){
        state = new ConcreteStateA();
    }

    public void changeState(State state) {
        this.state = state;
    }

    public void request() {
        state.handle(this);
    }
}
