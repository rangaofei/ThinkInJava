import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2017/2/13 0013.
 */
public class Test {
    private static String reg = "(\\d{3})";
    private static int a=0;

    public static void main(String[] args) {
        Pattern p = Pattern.compile(reg);
        Matcher m=p.matcher("123456");
        while (m.find()){
            System.out.println(++a);
            System.out.println(m.group()+": m.start()="+m.start()+",m.end()="+m.end());
            System.out.println(m.groupCount());
        }
        System.out.println(m.replaceAll("#"));
    }
}
