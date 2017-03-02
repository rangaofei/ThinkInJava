package fifteen;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args) {
        Generator<CountedObject> gen=BasicGenerator.create(CountedObject.class);
        for(int i=0;i<5;i++){
            System.out.println(gen.next());
        }
    }

}
