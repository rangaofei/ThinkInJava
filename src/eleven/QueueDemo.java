package eleven;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class QueueDemo {
    public static void printQ(Queue queue){
        while (queue.peek()!=null){
            System.out.println(queue.remove()+"");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<Integer>();
        Random rand=new Random(47);
        for(int i=0;i<10;i++){
            queue.offer(rand.nextInt(i+10));
        }
        printQ(queue);
        Queue<Character> qc=new LinkedList<Character>();
        for(char c:"Brontosaurus".toCharArray()){
            qc.offer(c);
        }
        printQ(qc);
    }

}
