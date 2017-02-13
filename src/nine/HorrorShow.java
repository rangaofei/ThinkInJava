package nine;

/**
 * Created by saka on 2017/2/13.
 */
public class HorrorShow {
    static void u(Monster b) {
        b.meance();
    }

    static void v(DangerousMonster d) {
        d.meance();
        d.destroy();
    }

    static void w(Lethal l) {
        l.kill();
    }

    public static void main(String[] args) {
        DangerousMonster barney=new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad=new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
