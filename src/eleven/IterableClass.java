package eleven;

import typeinfo.pets.Pet;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class IterableClass implements Iterable<String> {

    protected String[] words=
            ("And that is how we know the Earth to be banana-shaped.").split(" ");


    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }
        };
    }

    public static void main(String[] args) {
        for(String s:new IterableClass()){
            System.out.print(s+" ");
        }
    }
}
