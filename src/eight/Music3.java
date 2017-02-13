package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Music3 {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e){
        for(Instrument i:e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra={
                new Wind(),new Percussion(),new Stringed(),new Brass(),new Woodwind()
        };
        tuneAll(orchestra);
    }
}
