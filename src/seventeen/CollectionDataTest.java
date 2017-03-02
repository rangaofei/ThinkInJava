package seventeen;

import fifteen.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Administrator on 2017/2/28 0028.
 */

class Goverment implements Generator<String> {
    String[] foundation = ("Strange women lying in ponds distributing swords is no basis for a " +
            "system of goverment").split(" ");
    private int index;
    @Override
    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataTest {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(new CollectionData<>(new Goverment(), 15));
        set.addAll(CollectionData.list(new Goverment(), 15));
        System.out.println(set);
    }

}
