package twelve;

/**
 * Created by Administrator on 2017/2/17 0017.
 */
public class NeverCaught {

    static void f(){
        throw new RuntimeException("From f()");
    }

    static void g(){
        f();
    }

    public static void main(String[] args) {
        g();
    }

}
