package eleven;

import java.util.*;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class AddingFroup {
    public static void main(String[] args) {
        Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts={6,7,8,9,10};
        collection.addAll(Arrays.asList(moreInts));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,moreInts);
        for(Integer i:collection){
            System.out.print(i+" ");
        }
        System.out.println("----------");
        List<Integer> list=Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        for (Integer j:list){
            System.out.print(j+" ");
        }
//        list.add(21);
    }

}
