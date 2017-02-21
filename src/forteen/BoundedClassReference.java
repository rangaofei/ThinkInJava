package forteen;

/**
 * Created by Administrator on 2017/2/19.
 */
public class BoundedClassReference {
    public static void main(String[] args) {
        Class<? extends Number> bounded=int.class;
        bounded=double.class;
        bounded=Number.class;
    }
}
