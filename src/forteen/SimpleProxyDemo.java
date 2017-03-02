package forteen;

/**
 * Created by Administrator on 2017/2/23 0023.
 */

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface{

    @Override
    public void doSomething() {
        System.out.println("Do something");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("Do something else "+arg);
    }
}

class SimpleProxy implements Interface{
    private Interface proxied;

    public SimpleProxy(Interface proxied) {
        this.proxied = proxied;
    }

    @Override
    public void doSomething() {
        System.out.println("SimpleProxy doSomething");
        proxied.doSomething();
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("SimpleProxy somethingElse "+arg);
        proxied.somethingElse(arg);
    }
}

public class SimpleProxyDemo {

    public static void consumer(Interface inter){
        inter.doSomething();
        inter.somethingElse("Boom");
    }

    public static void main(String[] args) {
        consumer(new RealObject());
        consumer(new SimpleProxy(new RealObject()));
    }

}
