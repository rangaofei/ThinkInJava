package sixteen;

import fifteen.Generator;

import javax.annotation.Generated;
import java.util.Random;

/**
 * Created by Administrator on 2017/2/28 0028.
 */
public class CompType implements Comparable<CompType> {
    int i;
    int j;
    private static int count=1;
    public CompType(int n1,int n2){
        i=n1;
        j=n2;
    }

    public String toString(){
        String result="[i="+i+",j="+j+"]";
        if(count++%3==0){
            result+="\n";
        }
        return result;
    }
    @Override
    public int compareTo(CompType o) {
        return i<o.i?-1:(i==o.i?0:1);
    }

    private static Random random=new Random(47);
    public static Generator<CompType> generator(){
        return new Generator<CompType>() {
            @Override
            public CompType next() {
                return new CompType(random.nextInt(100), random.nextInt(100));
            }
        };
    }


}
