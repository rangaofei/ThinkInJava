package eleven;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class ApplesAndOrangesWithGenerics {
    public static void main(String[] args) {
        ArrayList<Apple> apples=new ArrayList<Apple>();
        for(int i=0;i<3;i++){
            apples.add(new Apple());
        }
        for(int i=0;i<apples.size();i++){
            System.out.println(apples.get(i).id());
        }
        for(Apple c:apples){
            System.out.println(c.id());
        }
    }

}
