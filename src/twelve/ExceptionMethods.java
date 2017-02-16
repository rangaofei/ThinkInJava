package twelve;

/**
 * Created by Administrator on 2017/2/16 0016.
 */
public class ExceptionMethods {
    public static void main(String[] args) {
        try{
            throw new Exception("My Exception");
        }catch (Exception e){
            System.out.println("Caught Exception");
            System.out.println("getMessage():"+e.getMessage());
            System.out.println("getLocalizedMessage():"+e.getLocalizedMessage());
            System.out.println("toString():"+e);
            System.out.println("printStaceTrace");
            e.printStackTrace();
        }
    }

}
