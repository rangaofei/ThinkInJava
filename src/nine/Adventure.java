package nine;

/**
 * Created by saka on 2017/2/13.
 */
public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }

    public static void u(CanSwim x){
        x.swim();
    }

    public static void v(CanFly x){
        x.fly();
    }

    public static void w(ActionCharacter x){
        x.fight();
    }

    public static void main(String[] args) {
        Hero h=new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
