package ten;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public abstract class Event {
    private long eventTime;
    protected final long delayTime;


    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start(){
        eventTime=System.nanoTime()+delayTime;
    }

    public boolean ready(){
        return System.nanoTime()>=eventTime;
    }

    public abstract void action();
}
