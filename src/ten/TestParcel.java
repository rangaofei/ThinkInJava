package ten;

/**
 * Created by Administrator on 2017/2/13 0013.
 */

interface Destination{
    String readLabel();
}

interface Contents{
    int value();
}

class Parcel4{
    private class PContents implements Contents{
        private int i=11;
        @Override
        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination{
        private String lable;
        private PDestination(String s){
            lable=s;
        }

        @Override
        public String readLabel() {
            return lable;
        }
    }

    public Destination destination(String s){
        return new PDestination(s);
    }

    public Contents contents(){
        return new PContents();
    }

}

public class TestParcel {
    public static void main(String[] args) {
        Parcel4 p=new Parcel4();
        Contents c=p.contents();
        Destination d=p.destination("Tsa");

    }
}
