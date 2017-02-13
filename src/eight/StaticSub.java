package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class StaticSub extends StaticSuper {
    public static String staticGet(){
        return "derived staticGet()";
    }

    public String dynamicGet(){
        return "Derived dynamicGet()";
    }
}
