package nine;

/**
 * Created by saka on 2017/2/12.
 */
public class Waveform {
    private static long counter;
    private final long id=counter++;
    public String toString(){
        return "Waveform "+id;
    }
}
