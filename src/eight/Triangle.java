package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Trangle.eraser()");
    }
}
