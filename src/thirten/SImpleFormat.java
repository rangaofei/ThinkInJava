package thirten;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class SImpleFormat {
    public static void main(String[] args) {
        int x=5;
        double y=5.32456;
        System.out.println("Row 1: "+x+ " "+y);
        System.out.format("Row 1: [%d %f]",x,y);
        System.out.println();
        System.out.printf("Row 1: [%d %f]",x,y);
    }

}
