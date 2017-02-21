package twelve;

/**
 * Created by Administrator on 2017/2/17 0017.
 */
public class MultipleReturns {
    public static void f(int i){
        System.out.println("Initialzation that requires cleanup");
        try{
            System.out.println("point 1");
            if(i==1){
                return;
            }
            System.out.println("point 2");
            if(i==2){
                return;
            }
            System.out.println("point 3");
            if(i==3){
                return;
            }
            System.out.println("end");
            return;
        }finally {
            System.out.println("Performing cleanup");
        }

    }

    public static void main(String[] args) {
        for(int i=1;i<4;i++){
            f(i);
        }
    }

}
