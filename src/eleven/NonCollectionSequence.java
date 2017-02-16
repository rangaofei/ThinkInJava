package eleven;

import typeinfo.pets.Pet;
import typeinfo.pets.Pets;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/2/15 0015.
 */

class PetSequence{
    protected Pet[] pets= Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
    public Iterator<Pet> iterator(){
        return new Iterator<Pet>(){
            private int index=0;

            @Override
            public boolean hasNext() {
                return index<pets.length;
            }

            @Override
            public Pet next() {
                return pets[index++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

    }

    public static void main(String[] args) {
        NonCollectionSequence nc=new NonCollectionSequence();
        InterfaceVsIterator.display(nc.iterator());
    }
}
