package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class Parcel9 {
    public Destination destination(final String dest){
        return new Destination() {
            private String label=dest;
            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 p=new Parcel9();
        Destination d=p.destination("Tsa");
        System.out.println(d.readLabel());
    }
}
