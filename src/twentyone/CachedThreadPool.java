package twentyone;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exex = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exex.execute(new LiftOff());
        }
        exex.shutdown();
    }
}
