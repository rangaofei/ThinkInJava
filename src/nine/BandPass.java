package nine;

/**
 * Created by saka on 2017/2/13.
 */
public class BandPass extends Filter {
    double lowCutoff,highCutoff;
    public BandPass(double lowCut,double highCut){
        lowCutoff=lowCut;
        highCutoff=highCut;
    }

    public Waveform process(Waveform input){
        return input;
    }
}
