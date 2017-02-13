package seven;

/**
 * Created by saka on 2017/2/11.
 */

class Poppet{
    private int i;
    Poppet(int i){
        this.i=i;
    }
}

public class BlankFinal {
    private final int i=0;
    private final int j;
    private final Poppet p;

    public BlankFinal(){
        j=1;
        p=new Poppet(1);
    }

    public BlankFinal(int i){
        j=i;
        p=new Poppet(i);
    }

    public static void main(String[] args) {
        new BlankFinal();
        new BlankFinal(47);
    }
}
