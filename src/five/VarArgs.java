package five;

/**
 * Created by saka on 2017/2/11.
 */

class A{}

public class VarArgs {
    static void printArray(Object[] arg) {
        for(Object obj:arg){
            System.out.println(obj+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Object[]{
                new Integer(47),new Float(3.14),new Double(11.11)
        });
        printArray(new Object[]{"one","two","three"});
        printArray(new Object[]{new A(),new A(),new A()});
    }
}
