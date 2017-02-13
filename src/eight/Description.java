package eight;

/**
 * Created by saka on 2017/2/12.
 */
public class Description {
    private String s;
    Description(String s){
        this.s=s;
        System.out.println("Creating Description "+s);
    }

    protected void dispose(){
        System.out.println("disposing Description "+s);
    }
}
