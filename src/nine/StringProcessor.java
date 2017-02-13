package nine;

import com.sun.corba.se.impl.oa.poa.AOMEntry;

/**
 * Created by saka on 2017/2/13.
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }


    public abstract String process(Object input);

    public static String s="If she weighs the same as a duck,she is made of wood";

    public static void main(String[] args) {
        Apply.process(new Upcase(),s);
        Apply.process(new Downcase(),s);
        Apply.process(new Splitter(),s);
    }
}
