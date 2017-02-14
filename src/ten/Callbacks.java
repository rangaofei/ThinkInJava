package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */

interface Increamentable{
    void increment();
}

class Callee1 implements Increamentable{
    private int i=0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement{
    public void increment(){
        System.out.println("Other operation");
    }

    static void f(MyIncrement mi){
        mi.increment();
    }
}

class Callee2 extends MyIncrement{
    private int i=0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }
    private class Closure implements Increamentable{

        @Override
        public void increment() {
            Callee2.this.increment();
        }
    }

    Increamentable getCallbackReference(){
        return new Closure();
    }
}

class Caller{
    private Increamentable callbackReference;
    Caller(Increamentable cbh){
        callbackReference=cbh;
    }
    void go(){
        callbackReference.increment();
    }
}

public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1=new Callee1();
        Callee2 c2=new Callee2();
        MyIncrement.f(c2);
        Caller caller1=new Caller(c1);
        Caller caller2=new Caller(c2.getCallbackReference());
        caller1.go();
        caller2.go();
    }
}
