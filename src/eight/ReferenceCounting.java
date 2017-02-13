package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared=new Shared();
        Composing[] composings={
                new Composing(shared),new Composing(shared)
        };
        for(Composing c:composings){
            c.dispose();
        }
    }
}
