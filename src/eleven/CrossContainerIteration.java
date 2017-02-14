package eleven;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.*;

/**
 * Created by Administrator on 2017/2/14.
 */
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it) {
        while (it.hasNext()) {
            Pet p = it.next();
            System.out.println(p.id() + ":" + p);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Pet> pets=Pets.arrayList(8);
        LinkedList<Pet> petLinkedList=new LinkedList<Pet>(pets);
        HashSet<Pet> petsHS=new HashSet<Pet>(pets);
        TreeSet<Pet> petTreeSet=new TreeSet<>(pets);
        display(pets.iterator());
        display(petsHS.iterator());
        display(petLinkedList.iterator());
        display(petTreeSet.iterator());
    }
}
