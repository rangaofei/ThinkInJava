package thirten;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by saka on 2017/2/19.
 */
public class TestRegularExpression {
    public static void main(String[] args) {
        String n="abcabcabcdefabc";
        String[] input={
                "abc+","(abc)+","(abc){2,}"
        };

        System.out.println("Input: \""+n+"\"");
        for(String arg:input){
            System.out.println("Regualr expression: \""+arg+"\"");
            Pattern p=Pattern.compile(arg);
            Matcher m=p.matcher(n);
            while(m.find()){
                System.out.println("Match \""+m.group()+"\"at position "+m.start()+"-"+(m.end()-1));
            }
        }
    }
}
