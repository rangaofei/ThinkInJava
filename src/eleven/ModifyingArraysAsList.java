package eleven;

import java.util.*;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class ModifyingArraysAsList {
    public static void main(String[] args) {
        Random random=new Random(47);
        Integer[] ia={1,2,3,4,5,6,7,8,9};
        List<Integer> list1=new ArrayList<>(Arrays.asList(ia));
        System.out.println("Before shuffling: "+list1);
        Collections.shuffle(list1,random);
        System.out.println("After shuffling: "+list1);
        System.out.println("array: "+Arrays.toString(ia));

        List<Integer> list2=Arrays.asList(ia);
        System.out.println("Before shuffling: "+list2);
        Collections.shuffle(list2,random);
        System.out.println("After shuffling: "+list2);
        System.out.println("array: "+Arrays.toString(ia));
    }

}
