package StrategyPattern;

/**
 * @author cristph
 * @date 2019-07-19 10:14
 */

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyA());
        context.algorithm();
        context.setStrategy(new StrategyB());
        context.algorithm();
    }
}
