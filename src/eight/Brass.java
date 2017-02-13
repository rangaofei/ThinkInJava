package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Brass extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Brass.play() "+n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
