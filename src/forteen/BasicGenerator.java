package forteen;

import net.mindview.util.Generator;

/**
 * Created by Administrator on 2017/2/23 0023.
 */
public class BasicGenerator<T> implements Generator<T> {
    private Class<T> type;

    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try{
            return type.newInstance();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    public static <T> Generator<T> create(Class<T> type){
        return new BasicGenerator<T>(type);
    }
}
