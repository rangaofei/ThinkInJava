package five;

/**
 * Created by saka on 2017/2/11.
 */
public class OptionalTrailingArguments {
    static void f(int required,String... trailing){
        System.out.println("required: "+required+" ");
        for(String s:trailing){
            System.out.print(s+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,"one");
        f(2,"two","three");
        f(0);
    }
}
