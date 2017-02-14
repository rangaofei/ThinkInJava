package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class Parcel7 {
    public Contents contents(){
        return new Contents() {
           private int i=11;
           public int value(){
               return i;
           }
        };
    }

    public static void main(String[] args) {
        Parcel7 p=new Parcel7();
        Contents c=p.contents();
    }
}
