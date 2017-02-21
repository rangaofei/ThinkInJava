package forteen;

import java.util.Random;

/**
 * Created by Administrator on 2017/2/18.
 */

class Initable {
    static final int staticFinal = 47;
    static final int staticFinal2 = ClassInitialization.rand.nextInt(1000);
    static {
        System.out.println("Initializing Initable");
    }
}

class Initable2{
    static int staticNonFinal=147;
    static {
        System.out.println("Initializing Initable2");
    }
}

class Initable3{
    static int staticNonFinal=74;
    static {
        System.out.println("Initializing Initable3");
    }
}

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable=Initable.class;
        System.out.println("1--------------------");
        System.out.println("After crreating Initable ref");
        System.out.println("2--------------------");
        System.out.println(Initable.staticFinal);
        System.out.println("3--------------------");
        System.out.println(Initable.staticFinal2);
        System.out.println("4--------------------");
        System.out.println(Initable2.staticNonFinal);
        System.out.println("5--------------------");
        try {
            Class initable3=Class.forName("forteen.Initable3");
            System.out.println("6--------------------");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("After creating Initable3 ref");
        System.out.println("7--------------------");
        System.out.println(Initable3.staticNonFinal);
        System.out.println("8--------------------");
    }
}
