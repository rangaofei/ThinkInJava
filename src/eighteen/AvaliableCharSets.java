package eighteen;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

public class AvaliableCharSets {
    public static void main(String[] args) {
        SortedMap<String, Charset> charSets = Charset.availableCharsets();
        Iterator<String> it=charSets.keySet().iterator();
        while (it.hasNext()){
            String scName=it.next();
            System.out.print(scName);
            Iterator aliases=charSets.get(scName).aliases().iterator();
            if(aliases.hasNext()){
                System.out.print(": ");
            }
            while (aliases.hasNext()){
                System.out.print(aliases.next());
                if(aliases.hasNext()){
                    System.out.println(", ");
                }
            }
            System.out.println();
        }
    }
}
