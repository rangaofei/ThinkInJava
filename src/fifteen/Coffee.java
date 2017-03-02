package fifteen;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class Coffee {
    private static long counter=0;
    private final long id=counter++;
    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }
}
