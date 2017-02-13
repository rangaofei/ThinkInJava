package nine;

/**
 * Created by saka on 2017/2/12.
 */
public class LowPass extends Filter {
    double cutoff;
    public LowPass(double cutoff){
        this.cutoff=cutoff;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
