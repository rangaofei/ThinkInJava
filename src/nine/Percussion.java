package nine;


import eight.Note;

/**
 * Created by saka on 2017/2/12.
 */
public class Percussion implements Instrument {
    @Override
    public void play(Note n) {
        System.out.println(this+" .play() "+n);
    }

    @Override
    public void adjust() {
        System.out.println(this+" .adjust()");

    }

    public String toString(){
        return "Percussion";
    }
}
