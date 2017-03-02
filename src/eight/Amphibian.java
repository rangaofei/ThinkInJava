package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class Amphibian extends Animal {
    private Characteristic p=new Characteristic("can live in whater");
    private Description t=new Description("Both water and land");
    public Amphibian(){
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
