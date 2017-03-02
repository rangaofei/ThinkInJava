package twenty;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public class Testable {

    public void execute(){
        System.out.println("Executing...");
    }
    @Test
    void testExecute(){
        execute();
    }

}
