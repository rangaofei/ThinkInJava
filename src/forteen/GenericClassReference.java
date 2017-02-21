package forteen;

/**
 * Created by Administrator on 2017/2/19.
 */
public class GenericClassReference {
    public static void main(String[] args) {
        Class intClass=int.class;
        Class<Integer> genericIntClass=int.class;
        genericIntClass=Integer.class;
        intClass=double.class;
//        genericIntClass=double.class;  //泛型的class不能引用改变class类型
    }
}
