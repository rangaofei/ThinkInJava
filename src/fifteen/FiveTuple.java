package fifteen;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class FiveTuple<A, B, C, D, E> extends FourTuple {
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E fifth) {
        super(a, b, c, d);
        this.fifth = fifth;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + "," + third + "," + fourth + "," + fifth + ")";
    }
}
