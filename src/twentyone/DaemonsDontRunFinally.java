package twentyone;

import java.util.concurrent.TimeUnit;

class ADaemon implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Starting ADameon");
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println("This should always run?");
        }
    }
}

public class DaemonsDontRunFinally {
    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new ADaemon());
        t.setDaemon(true);
        t.start();
        TimeUnit.MILLISECONDS.sleep(100);
    }
}
