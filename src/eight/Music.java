package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind fluent=new Wind();
        tune(fluent);
    }
}
