package seventeen;

import sixteen.RandomGenerator;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public class CollectionDataGeneration {
    public static void main(String[] args) {
        System.out.println(new ArrayList<String>(
                CollectionData.list(new RandomGenerator.String(9),10)
        ));

        System.out.println(new HashSet<Integer>(
                new CollectionData<Integer>(new RandomGenerator.Integer(),10)
        ));
    }

}
