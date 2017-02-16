package twelve;

/**
 * Created by Administrator on 2017/2/16 0016.
 */
public class WhoCalled {
    static void f() {
        try {
            throw new Exception();
        } catch (Exception e) {
            for(StackTraceElement ste:e.getStackTrace()){
                System.out.println(ste.getMethodName());
            }
        }
    }

    static void g(){
        f();
    }

    static void h(){
        g();
    }

    public static void main(String[] args) {
        f();
        System.out.println("--------------------------------");
        g();
        System.out.println("--------------------------------");
        h();
    }
}
