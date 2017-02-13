package eight;

/**
 * Created by saka on 2017/2/11.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Circle.eraser()");
    }
}
