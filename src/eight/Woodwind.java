package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Woodwind extends Wind {
    @Override
    public void play(Note n) {
        System.out.println("Woodwind.play()"+n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}
