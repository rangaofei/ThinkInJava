package five;

/**
 * Created by saka on 2017/2/11.
 */
public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree){
        this.degree=degree;
    }

    public void describe(){
        System.out.print("this burrito is :");
        switch (degree){
            case NOT:
                System.out.println("Not spicy at all");
                break;
            case MILD:
            case MEDIUM:
                System.out.println("a little hot");
                break;
            case HOT:
            case FLAMING:
                default:
                    System.out.println("may be too hot");
        }
    }

    public static void main(String[] args) {
        Burrito plain=new Burrito(Spiciness.HOT);
        Burrito greenChile=new Burrito(Spiciness.MEDIUM);
        Burrito jal=new Burrito(Spiciness.HOT);
        plain.describe();
        greenChile.describe();
        jal.describe();
    }
}
