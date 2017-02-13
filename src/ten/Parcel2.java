package ten;

/**
 * Created by Administrator on 2017/2/13 0013.
 */
public class Parcel2 {
    class Contents{
        private int i=11;
        public int value(){
            return i;
        }
    }
    class Destination{
        private String label;
        Destination(String whereto){
            label=whereto;
        }

        String readLabel(){
            return label;
        }
    }

    public Destination to(String s){
        return new Destination(s);
    }

    public Contents contents(){
        return new Contents();
    }

    public void ship(String dest){
        Contents c=contents();
        Destination d=to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p=new Parcel2();
        p.ship("Tsa");
        Parcel2 q=new Parcel2();
        Contents c=q.contents();
        Destination d=q.to("bor");
    }
}
