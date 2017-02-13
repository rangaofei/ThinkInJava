package nine;

/**
 * Created by saka on 2017/2/12.
 */
public class Upcase extends StringProcessor {


    @Override
    public String process(Object input) {
        return ((String) input).toUpperCase();
    }
}
