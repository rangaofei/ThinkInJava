package fifteen;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class TwoTuple<A,B> {
    public final A first;
    public final B second;

    public TwoTuple(A first, B second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "("+first+","+second+")";
    }
}
