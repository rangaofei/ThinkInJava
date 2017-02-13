package five;

/**
 * Created by saka on 2017/2/11.
 */
public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness s:Spiciness.values()){
            System.out.println(s+". ordinal "+s.ordinal());
        }
    }
}
