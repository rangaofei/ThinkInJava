package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class StaticPolymorphism {
    public static void main(String[] args) {
        StaticSuper sup=new StaticSub();
        System.out.println(sup.statticGet());
        System.out.println(sup.dynamicGet());
    }
}
