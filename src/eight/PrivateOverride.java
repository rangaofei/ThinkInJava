package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class PrivateOverride {

    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po=new Derived();
        po.f();
    }
}
