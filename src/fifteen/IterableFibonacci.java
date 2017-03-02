package fifteen;

import java.util.Iterator;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {

    private int n;
    public IterableFibonacci(int count){
        n=count;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n>0;
            }

            @Override
            public Integer next() {
                n--;
                return IterableFibonacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i:new IterableFibonacci(18)){
            System.out.print(i+" ");
        }
    }
}
