package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Instrument {
    public void play(Note n){
        System.out.println("Instrument.play()"+n);
    }

    String what(){
        return "Instrument";
    }

    void adjust(){
        System.out.println("Adjusting Wind");
    }
}
