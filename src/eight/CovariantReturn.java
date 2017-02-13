package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m=new Mill();
        Grain g=m.process();
        System.out.println(g);
        m=new WheatMill();
        g=m.process();
        System.out.println(g);
    }
}
