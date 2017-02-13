package five;

/**
 * Created by saka on 2017/2/11.
 */
public class VarargType {
    static void f(Character... args){
        System.out.println(args.getClass());
        System.out.println("length "+args.length);
    }

    static void g(int... args){
        System.out.println(args.getClass());
        System.out.println("length "+args.length);
    }

    public static void main(String[] args) {
        f('a');
        f();
        g(1);
        g();
    }
}
