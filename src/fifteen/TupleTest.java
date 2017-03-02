package fifteen;

import eight.Amphibian;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class TupleTest {
    static TwoTuple<String, Integer> f() {
        return new TwoTuple<>("hi", 47);
    }
    static ThreeTuple<Amphibian,String,Integer> g(){
        return new ThreeTuple<>(new Amphibian(),"hi",57);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi=f();
        System.out.println(ttsi);
        System.out.println(g());
    }
}
