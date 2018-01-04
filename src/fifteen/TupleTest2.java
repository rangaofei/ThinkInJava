package fifteen;

import static fifteen.Tuple.*;

public class TupleTest2 {
    static TwoTuple<String, Integer> f() {
        return tuple("hi", 4);
    }

    static TwoTuple f2() {
        return tuple("hi", 44);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> ttsi = f();
        System.out.println(ttsi);
        System.out.println(f2());
    }
}
