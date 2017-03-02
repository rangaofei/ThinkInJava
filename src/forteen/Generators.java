package forteen;

import net.mindview.util.Generator;
import ninteen.Food;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Administrator on 2017/2/23 0023.
 */
public class Generators {

    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen,int n){
        for(int i=0;i<n;i++){
            coll.add(gen.next());
        }
        return coll;
    }


}
