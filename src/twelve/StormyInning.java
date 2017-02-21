package twelve;

/**
 * Created by Administrator on 2017/2/20 0020.
 */

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class Inning {
    public Inning() throws BaseballException {
    }

    public void event() throws BaseballException {
    }

    public abstract void atBat() throws Strike, Foul;

    public void walk() {
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    public void event() throws RainedOut;

    public void rainhard() throws RainedOut;
}


public class StormyInning {

    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul,BaseballException{

    }
    void walk() throws PopFoul{

    }

    public static void main(String[] args) {

    }

}
