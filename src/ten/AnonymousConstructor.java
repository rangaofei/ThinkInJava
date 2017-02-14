package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
abstract class Base{
    public Base(int i){
        System.out.println("Base constructor,i="+i);
    }
    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("Inside instance initializer");
            }

            @Override
            public void f() {
                System.out.println("In aninymus f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base=getBase(47);
        base.f();
    }
}
