package eight;

import java.util.Random;

/**
 * Created by saka on 2017/2/11.
 */
public class RandomShapeGenerator {
    private Random rand=new Random(47);
    public Shape next(){
        switch (rand.nextInt(3)){
            default:
            case 0:
                return new Circle();
            case 1:
                return new Squre();
            case 2:
                return new Triangle();
        }
    }
}
