package ninteen;

import ten.ClassInInterface;

import java.util.Random;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class Enums {
    private static Random ran=new Random(47);
    public static <T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }
    public static <T> T random(T[] values){
        return values[ran.nextInt(values.length)];
    }
}
