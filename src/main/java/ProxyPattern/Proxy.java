package ProxyPattern;

public class Proxy implements Subject{

    private Subject subject;

    public Proxy(){
        subject=new RealSubject();
    }

    private void beforeRequest(){
        System.out.println("before request");
    }

    private void afterRequest(){
        System.out.println("after request");
    }

    public void request() {
        beforeRequest();
        subject.request();
        afterRequest();
    }
}
