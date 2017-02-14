package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class Parcel10 {
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;

            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Over budget!");
                }
            }
            private String label=dest;
            public String readlabel(){
                return label;
            }

            @Override
            public String readLabel() {
                return null;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p=new Parcel10();
        Destination d=p.destination("Tsa",101.9F);
    }
}
