import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/2/17 0017.
 */
public class Reg {
    private static final String holder = "\\";
    private static String input = "\"我只是\"一\"个假设\"";

    private static String replace(String in,String holder) {
        Pattern p = Pattern.compile(holder);
        Matcher matcher = p.matcher(input);
        String out = matcher.replaceAll(" ");
        return out;
    }

    public static void main(String[] args) {
        System.out.println(input);
        String s=input.replace('\\','a');
        System.out.println(s);
//        System.out.println(replace(input,holder));
    }


}
