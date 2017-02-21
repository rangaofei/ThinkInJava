package forteen;

/**
 * Created by Administrator on 2017/2/19.
 */
public class GenericToyTest {
    public static void main(String[] args) {
        Class<FancyToy> ftClass=FancyToy.class;
        try {
            FancyToy fancyToy=ftClass.newInstance();
            Class<? super FancyToy> up=ftClass.getSuperclass();
            Object obj=up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
