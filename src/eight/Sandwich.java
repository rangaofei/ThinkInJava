package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class Sandwich extends ProtableLunch {
    private static Bread b=new Bread();
    private Cheese c=new Cheese();
    private Lettuce l=new Lettuce();
    public Sandwich(){
        System.out.println("Sandvich()");
    }

    public static void main(String[] args) {
        new Sandwich();
    }
}
