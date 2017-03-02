package seventeen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/2/28 0028.
 */

class StringAdress {
    private String s;

    public StringAdress(String s) {
        this.s = s;
    }

    public String toString() {
        return super.toString() + " " + s;
    }
}

public class FillingLists {
    public static void main(String[] args) {
        List<StringAdress> list = new ArrayList<>(
                Collections.nCopies(4, new StringAdress("Hello")));
        System.out.println(list);
        Collections.fill(list,new StringAdress("World!"));
        System.out.println(list);
    }

}
