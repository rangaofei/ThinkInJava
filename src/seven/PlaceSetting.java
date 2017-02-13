package seven;

/**
 * Created by saka on 2017/2/11.
 */

class Plate {
    Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate{

    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil{
    Utensil(int i){
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil{

    Spoon(int i) {
        super(i);
    }
}

class Fork extends Utensil{

    Fork(int i) {
        super(i);
    }
}

class Knife extends Utensil{

    Knife(int i) {
        super(i);
    }
}

class Custom{
    Custom(int i){
        System.out.println("Custom conmstructor");
    }
}

public class PlaceSetting  extends Custom{

    private Spoon sp;
    private Fork fork;
    private Knife knife;
    private DinnerPlate dp;

    PlaceSetting(int i) {
        super(i+1);
        sp=new Spoon(i+2);
        fork=new Fork(i+3);
        knife=new Knife(i+4);
        dp=new DinnerPlate(i+5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x=new PlaceSetting(9);
    }
}
