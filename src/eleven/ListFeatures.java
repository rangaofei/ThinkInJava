package eleven;

import typeinfo.pets.*;

import java.util.*;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class ListFeatures {
    public static void main(String[] args) {
        Random rand=new Random(47);
        List<Pet> pets= Pets.arrayList(7);
        System.out.println("1: "+pets);
        Hamster h=new Hamster();
        pets.add(h);
        System.out.println("2: "+pets);
        System.out.println("3: "+pets.contains(h));
        pets.remove(h);
        Pet p=pets.get(2);
        System.out.println("4: "+p+" "+pets.indexOf(p));
        Pet cymric =new Cymric();
        System.out.println("5: "+pets.indexOf(cymric));
        System.out.println("6: "+pets.remove(cymric));
        System.out.println("7: "+pets.remove(p));
        System.out.println("8: "+pets);
        pets.add(3,new Mouse());
        System.out.println("9: "+pets);
        List<Pet> sub=pets.subList(1,4);
        System.out.println("sublist: "+sub);
        System.out.println("10: "+pets.containsAll(sub));
        Collections.sort(sub);
        System.out.println("sorted subList: "+sub);
        System.out.println("11: "+pets.containsAll(sub));
        Collections.shuffle(sub,rand);
        System.out.println("shuffled sublist: "+sub);
        System.out.println("12: "+pets.containsAll(sub));
        List<Pet> copy=new ArrayList<Pet>(pets);
        sub= Arrays.asList(pets.get(1),pets.get(4));
        System.out.println("sub: "+sub);
        copy.retainAll(sub);//移除sub以外的所有元素
        System.out.println("13: "+copy);
        copy=new ArrayList<Pet>(pets);
        copy.remove(2);
        System.out.println("14: "+copy);
        copy.removeAll(sub);
        System.out.println("15: "+copy);
        copy.set(1,new Mouse());
        System.out.println("16: "+copy);
        copy.addAll(2,sub);
        System.out.println("17: "+copy);
        System.out.println("18: "+pets.isEmpty());
        pets.clear();
        System.out.println("19: "+pets);
        System.out.println("20: "+pets.isEmpty());
        pets.addAll(Pets.arrayList(4));
        System.out.println("21: "+pets);
        Object[] o=pets.toArray();
        System.out.println("22: "+o[3]);
        Pet[] pa=pets.toArray(new Pet[0]);
        System.out.println("23: "+pa[3].id());

    }

}
