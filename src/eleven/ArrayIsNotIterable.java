package eleven;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t+" ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1,2,3));
        String[] strings={"A","B","C"};
        test(Arrays.asList(strings));
    }

}
