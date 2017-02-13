package nine;

import java.util.Arrays;

/**
 * Created by saka on 2017/2/12.
 */
public class Splitter extends StringProcessor {

    @Override
    public String process(Object input){
        return Arrays.toString(((String)input).split(" "));
    }
}
