package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public interface ClassInInterface {
    void howdy();

    class Test implements ClassInInterface{

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }

        public static void main(String[] args) {
            new Test().howdy();
        }
    }
}
