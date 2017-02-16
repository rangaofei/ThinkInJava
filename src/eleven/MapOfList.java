package eleven;

import typeinfo.pets.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class MapOfList {
    public static Map<Person,List<? extends Pet>> petPeople=new HashMap<>();
    static {
        petPeople.put(new Person("Dawn"),
                Arrays.asList(new Cymric("Molly"),new Mutt("Spot")));
        petPeople.put(new Person("Kate"),
                Arrays.asList(new Cat("Shackleton"),new Cat("Elise May"),new Dog("Margret")));

    }

    public static void main(String[] args) {
        System.out.println("people: "+petPeople.keySet());
        System.out.println("pets: "+petPeople.values());
        for(Person p:petPeople.keySet()){

            System.out.println(p+"has:");
            for(Pet pet:petPeople.get(p)){
                System.out.println("   "+pet);
            }
        }
    }

}
