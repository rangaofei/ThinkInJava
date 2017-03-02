package thirten;

import java.util.Arrays;

/**
 * Created by saka on 2017/2/19.
 */
public class Splitting {
    public static String knights="Then,when you have found the shrubbery,you must cut down the mightiest";
    public static void split(String regex){
        System.out.println(Arrays.toString(knights.split(regex)));
    }

    public static void main(String[] args) {
        split(" ");
        split("\\W+");
        split("n\\W+");
    }
}
