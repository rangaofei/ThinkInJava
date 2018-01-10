package seven;

/**
 * Created by saka on 2017/2/11.
 */

class Game {
    Game(int i) {
        System.out.println("Game constructor" + "   i=" + i);
    }
}

class Boarder extends Game {

    Boarder(int i) {
        super(i);
        System.out.println("Border constructor" + "   i=" + i);
    }
}

public class Chess extends Boarder {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
