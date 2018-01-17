package twentyone;

import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ActiveObjectDemo {
    private ExecutorService exec = Executors.newSingleThreadExecutor();
    private Random random = new Random(47);

    private void pause(int factor) {
        try {
            TimeUnit.MILLISECONDS.sleep(100 + random.nextInt(factor));
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public Future<Integer> calInt(final int x, final int y) {
        return exec.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                System.out.println("starting " + x + " + " + y);
                pause(500);
                return x + y;
            }
        });
    }

    public void shutDown() {
        exec.shutdown();
    }

    public static void main(String[] args) {
        ActiveObjectDemo d1 = new ActiveObjectDemo();
        List<Future<Integer>> results = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 5; i++) {
            results.add(d1.calInt(i, i));
        }
        System.out.println("All async call made");
        while (results.size() > 0) {
            for (Future<Integer> f : results) {
                if (f.isDone()) {
                    try {
                        System.out.println(f.get());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                    results.remove(f);
                }
            }
        }
        d1.shutDown();
    }
}
