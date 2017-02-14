package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class Parcel5 {
    public Destination destination(String s){
        class PDestination implements Destination{
            private String label;

            private PDestination(String whereTo){
                this.label=whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }
        return new PDestination(s);
    }

    public static void main(String[] args) {
        Parcel5 p=new Parcel5();
        Destination d=p.destination("Tsa");
        System.out.println(d.readLabel());
    }
}
