package eleven;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class ForEachCollections {
    public static void main(String[] args) {
        Collection<String> cs=new LinkedList<>();
        Collections.addAll(cs,"Take the long way home".split(" "));
        for(String s:cs){
            System.out.println("'"+s+"'");
        }
    }

}
