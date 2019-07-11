package BridgePattern;

/***
 *
 * 理解桥接模式，重点需要理解如何将抽象化(Abstraction)与实现化(Implementation)脱耦，
 * 使得二者可以独立地变化。
 *
 * 抽象化：抽象化就是忽略一些信息，把不同的实体当作同样的实体对待。
 * 在面向对象中，将对象的共同性质抽取出来形成类的过程即为抽象化的过程。
 *
 * 实现化：针对抽象化给出的具体实现，就是实现化，抽象化与实现化是一对互逆的概念，
 * 实现化产生的对象比抽象化更具体，是对抽象化事物的进一步具体化的产物。
 *
 *
 * 脱耦：脱耦就是将抽象化和实现化之间的耦合解脱开，或者说是将它们之间的强关联改换成弱关联，
 * 将两个角色之间的继承关系改为关联关系。桥接模式中的所谓脱耦，就是指在一个软件系统的抽象化和实现化
 * 之间使用关联关系（组合或者聚合关系）而不是继承关系，从而使两者可以相对独立地变化，
 * 这就是桥接模式的用意。
 *
 *
 */

public class Main {

    public static void main(String[] args) {
        Abstraction abstraction = new RefinedAbstraction(new ConcreteImplementorA());
        abstraction.operation();
        abstraction = new RefinedAbstraction(new ConcreteImplementorB());
        abstraction.operation();
    }
}
