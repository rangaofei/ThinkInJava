package eleven;

import typeinfo.pets.Cat;
import typeinfo.pets.Dog;
import typeinfo.pets.Hamster;
import typeinfo.pets.Pet;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class PetMap {
    public static void main(String[] args) {
        Map<String,Pet> petMap=new HashMap<>();
        petMap.put("My Cat",new Cat("Moly"));
        petMap.put("My Dog",new Dog("Ginger"));
        petMap.put("My Hamster",new Hamster("Bosco"));
        System.out.println(petMap);
        Pet dog=petMap.get("My Dog");
        System.out.println(dog);
        System.out.println(petMap.containsKey("My Dog"));
        System.out.println(petMap.containsValue(dog));
    }

}
