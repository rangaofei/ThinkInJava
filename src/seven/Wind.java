package seven;

/**
 * Created by saka on 2017/2/11.
 */

class Instrument{
    public void play(){};
    static void tune(Instrument i){
        i.play();
    }
}

public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute=new Wind();
        Instrument.tune(flute);
    }
}
