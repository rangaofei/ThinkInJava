package seven;

/**
 * Created by saka on 2017/2/11.
 */

class Homer {
    char doh(char c){
        System.out.println("do(char)");
        return 'd';
    }
    float doh(float f){
        System.out.println("do(float)");
        return 1.0f;
    }
}

class Milehouse{}

class Bart extends Homer{
    void doh(Milehouse m){
        System.out.println("do(Milehouse)");
    }
}

public class Hide {
    public static void main(String[] args) {
        Bart b=new Bart();
        b.doh(1);
        b.doh('a');
        b.doh(1.0f);
        b.doh(new Milehouse());
    }
}
