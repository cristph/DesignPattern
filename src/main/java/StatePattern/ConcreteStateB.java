package StatePattern;

/**
 * @author cristph
 * @date 2019-07-19 09:51
 */

public class ConcreteStateB extends State {

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateB handle");
        context.changeState(new ConcreteStateA());
    }
}
