package twelve;

/**
 * Created by Administrator on 2017/2/16 0016.
 */

class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {

    public static void f() throws OneException {
        System.out.println("originating the exception in f()");
        throw new OneException("throw from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in inner try,e.perintStackTrace()");
                e.printStackTrace(System.out);
                throw new TwoException("from inner try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in outer try,e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }

}
