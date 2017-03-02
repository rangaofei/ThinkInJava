package sixteen;

import fifteen.Generator;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class GeneratorTest {
    public static int size=10;
    public static void test(Class<?> surroundingClass){
        for (Class<?> type:surroundingClass.getClasses()){
            System.out.print(type.getSimpleName()+": ");
            try {
                Generator<?> g= (Generator<?>) type.newInstance();
                for(int i=0;i<size;i++){
                    System.out.printf(g.next()+" ");
                }
                System.out.println();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator.class);
    }
}
