package nine;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/2/13 0013.
 */
public class RandomWords implements Readable {
    private static Random rand=new Random(47);
    private static final char[] capitals="ABCDEFG".toCharArray();
    private static final char[] lowers="abcdefg".toCharArray();
    private static final char[] vowles="aeiod".toCharArray();
    private int count;
    public RandomWords(int count){
        this.count=count;
    }

    @Override
    public int read(CharBuffer cb){
        if(count--==0){
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i=0;i<4;i++){
            cb.append(vowles[rand.nextInt(vowles.length)]);
            cb.append(lowers[rand.nextInt(lowers.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(new RandomWords(10));
        while (s.hasNext()){
            System.out.println(s.next());
        }
    }
}
