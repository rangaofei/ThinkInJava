package twentyone;

import java.io.IOException;

class UnresponseiveUI {
    private volatile double d = 1;

    public UnresponseiveUI() throws IOException {
        while (d > 0) {
            d = d + (Math.PI + Math.E) / d;
        }
        System.in.read();
    }

}

public class ResponseiveUI extends Thread {
    private static volatile double d=1;
    public ResponseiveUI(){
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true){
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) throws IOException {
        new ResponseiveUI();
        System.in.read();
        System.out.println(d);
    }
}
