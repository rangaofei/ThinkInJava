package twentyone;

public class SynchronizedEvenGenerator extends IntGenerator {
    private int currentValue = 0;

    @Override
    public synchronized int next() {
        ++currentValue;
        Thread.yield();
        ++currentValue;
        return currentValue;
    }

    public static void main(String[] args) {
        EvenChecker.test(new SynchronizedEvenGenerator());
    }
}
