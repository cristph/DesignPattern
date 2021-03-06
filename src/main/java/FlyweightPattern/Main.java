package FlyweightPattern;


/***
 *
 * @see <link>https://design-patterns.readthedocs.io/zh_CN/latest/structural_patterns/flyweight.html</>
 *
 * 享元模式是一个考虑系统性能的设计模式，通过使用享元模式可以节约内存空间，提高系统的性能。
 *
 * 享元模式的核心在于享元工厂类，享元工厂类的作用在于提供一个用于存储享元对象的享元池，
 * 用户需要对象时，首先从享元池中获取，如果享元池中不存在，则创建一个新的享元对象返回给用户，
 * 并在享元池中保存该新增对象。
 *
 * 享元模式以共享的方式高效地支持大量的细粒度对象，
 * 享元对象能做到共享的关键是区分内部状态(Internal State)和外部状态(External State)。
 *
 * 内部状态是存储在享元对象内部并且不会随环境改变而改变的状态，因此内部状态可以共享。
 * 外部状态是随环境改变而改变的、不可以共享的状态。享元对象的外部状态必须由客户端保存，
 * 并在享元对象被创建之后，在需要使用的时候再传入到享元对象内部。
 * 一个外部状态与另一个外部状态之间是相互独立的。
 *
 *
 */


public class Main {

    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        flyweightFactory.getFlyweight("test").operation();
        flyweightFactory.getFlyweight("test2").operation();
        flyweightFactory.getFlyweight("test").operation();
    }
}
