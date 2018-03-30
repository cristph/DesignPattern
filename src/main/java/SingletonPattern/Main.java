package SingletonPattern;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton == null ? "singleton not ini" : singleton.toString());

        Singleton2 singleton2 = Singleton2.getInstance();
        System.out.println(singleton2 == null ? "singleton2 not ini" : singleton2.toString());

        Singleton3 singleton3 = Singleton3.getInstance();
        System.out.println(singleton3 == null ? "singleton3 not ini" : singleton3.toString());
    }
}