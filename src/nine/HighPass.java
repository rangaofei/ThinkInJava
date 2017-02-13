package nine;

/**
 * Created by saka on 2017/2/12.
 */
public class HighPass extends Filter {
    double cutoff;
    public HighPass(double cutoff){
        this.cutoff=cutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
