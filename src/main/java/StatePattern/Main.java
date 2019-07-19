package StatePattern;

/**
 * @author cristph
 * @date 2019-07-19 09:52
 */

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        context.request();
        context.request();
    }
}
