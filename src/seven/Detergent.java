package seven;

/**
 * Created by saka on 2017/2/11.
 */



public class Detergent extends Cleanser{
    public void scrub(){
        append("Detergent.scrub()");
        super.scrub();
    }

    public void foam(){
        append("foam()");
    }

    public static void main(String[] args) {
        Detergent x=new Detergent();
        x.dilute();
        x.apply();
        x.scrub();
        x.foam();
        System.out.println(x);
        System.out.println("Testing base class");
        Cleanser.main(args);
    }
}
