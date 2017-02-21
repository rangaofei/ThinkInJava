package forteen;

/**
 * Created by Administrator on 2017/2/19.
 */
public class WildcardClassReference {
    public static void main(String[] args) {
        Class<?> intClass=int.class;
        intClass=double.class;
    }
}
