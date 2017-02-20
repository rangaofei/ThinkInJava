package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */

enum Activity{SITTING,LYING,STANDING,HOPPING,RUNNING,DODGING,JUNPING,FAILING,FLYING}

public class RandomTest {
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.print(Enums.random(Activity.class)+" ");
        }
    }

}
