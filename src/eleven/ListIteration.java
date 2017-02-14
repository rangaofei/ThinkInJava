package eleven;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Pet> pets= Pets.arrayList(8);
        ListIterator<Pet> it=pets.listIterator();
        while (it.hasNext()){
            System.out.println(it.next()+","+it.nextIndex()+","+it.previousIndex()+";");
        }
        System.out.println();
        while (it.hasPrevious()){
            System.out.println(it.previous().id());
        }
        System.out.println();
        System.out.println(pets);
        it=pets.listIterator(3);
        while (it.hasNext()){
            it.next();
            it.set(Pets.randomPet());
        }
        System.out.println(pets);
    }

}
