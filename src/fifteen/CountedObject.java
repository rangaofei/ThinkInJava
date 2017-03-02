package fifteen;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class CountedObject {
    private static long counter=0;
    private final long id=counter++;
    public long id(){
        return id;
    }

    @Override
    public String toString() {
        return "ConutedObject "+id;
    }
}
