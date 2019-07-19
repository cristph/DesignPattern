package StrategyPattern;

/**
 * @author cristph
 * @date 2019-07-19 10:09
 */

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void algorithm() {
        strategy.algorithm();
    }
}
