package twelve;

/**
 * Created by Administrator on 2017/2/17 0017.
 */

class OnOffException1 extends Exception {
}

class OnOffException2 extends Exception {
}

public class OnOffSwitch {
    private static Switch sw = new Switch();

    public static void f() throws OnOffException1, OnOffException2 {

    }

    public static void main(String[] args) {

        try {
            sw.on();
            f();

        } catch (OnOffException1 onOffException1) {
            onOffException1.printStackTrace();

        } catch (OnOffException2 onOffException2) {
            onOffException2.printStackTrace();

        } finally {
            sw.off();
        }
    }

}
