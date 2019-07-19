package StatePattern;

/**
 * @author cristph
 * @date 2019-07-19 09:51
 */

public class ConcreteStateA extends State {

    @Override
    public void handle(Context context) {
        System.out.println("ConcreteStateA handle");
        context.changeState(new ConcreteStateB());
    }
}
