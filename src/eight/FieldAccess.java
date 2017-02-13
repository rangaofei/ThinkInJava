package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class FieldAccess {
    public static void main(String[] args) {
        Super sup=new Sub();
        System.out.println("sup.field="+sup.field+",super.getField()="+sup.getField());

        Sub sub=new Sub();
        System.out.println("sub.field="+sub.field+",sub.getField()="+sub.getField()
        +"sub.getSuperField()="+sub.getSuperField());
    }
}
