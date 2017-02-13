package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Music2 {
    public static void tune(Wind i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tune(Stringed s){
        s.play(Note.MIDDLE_C);
    }

    public static void tune(Brass b){
        b.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute=new Wind();
        Stringed vilion=new Stringed();
        Brass frenchHorn=new Brass();
        tune(flute);
        tune(vilion);
        tune(frenchHorn);
    }
}
