package nine;

import eight.Note;

/**
 * Created by saka on 2017/2/12.
 */
public class Music4 {
    static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e){
        for(Instrument i:e){
            tune(i);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra={
                new Wind(),new Percussion(),new Stringed(),new Brass(),new WoodWind()
        };

        tuneAll(orchestra);
    }
}
