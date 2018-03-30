package SingletonPattern;

/**
 * Created by Cristph on 2018/3/29.
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
}
