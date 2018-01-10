package seventeen;

import java.util.AbstractList;

public class CountingInteger extends AbstractList<Integer> {
    private int size;

    public CountingInteger(int size) {
        this.size = size < 0 ? 0 : size;
    }

    @Override
    public Integer get(int index) {
        return Integer.valueOf(index);
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingInteger(30));
    }
}
