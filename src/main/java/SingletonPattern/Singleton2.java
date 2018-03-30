package SingletonPattern;

public class Singleton2 {

    private Singleton2(){}

    private static class Singleton2Holder{
        private static Singleton2 singleton2=new Singleton2();
    }

    public static Singleton2 getInstance(){
        return Singleton2Holder.singleton2;
    }

}
