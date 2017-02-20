package twelve;

/**
 * Created by Administrator on 2017/2/17 0017.
 */

class FourException extends Exception{}

public class AlwaysFinally {
    public static void main(String[] args) {
        System.out.println("Entering first try block");
        try{
            System.out.println("Entering second try block");
            try{
                throw new FourException();
            }finally {
                System.out.println("Finally in 2nd try block");
            }
        }catch (FourException e){
            System.out.println("Caught Four Exception in 1st try block");
        }
    }
}
