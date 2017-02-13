package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class Characteristic {
    private String s;
    Characteristic(String s){
        this.s=s;
        System.out.println("Creating Characteristic"+s);
    }

    protected void dispose(){
        System.out.println("disposing Characteristic"+s);
    }
}
