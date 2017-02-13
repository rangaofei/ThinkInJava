package ten;

import java.util.Objects;

/**
 * Created by Administrator on 2017/2/13 0013.
 */
public interface Selector {
    boolean end();
    Object current();
    void next();
}
