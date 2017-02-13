package nine;

/**
 * Created by saka on 2017/2/12.
 */
public interface Processor {
    String name();
    Object process(Object input);
}
