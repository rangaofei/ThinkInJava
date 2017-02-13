package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class Animal extends LivingCreature {
    private Characteristic p=new Characteristic("has heart");
    private Description t=new Description("Animal not vegetable");
    Animal(){
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
