package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description t=new Description("Basic Living Creature");
    LivingCreature(){
        System.out.println("LivingCreature()");
    }

    protected void dispose(){
        System.out.println("LivingCreature");
        t.dispose();
        p.dispose();
    }
}
