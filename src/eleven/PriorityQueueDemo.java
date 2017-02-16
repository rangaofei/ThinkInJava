package eleven;

import java.util.*;

/**
 * Created by Administrator on 2017/2/15 0015.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        Random rand=new Random(47);
        for(int i=0;i<10;i++){
            priorityQueue.offer(rand.nextInt(i+10));
        }
        QueueDemo.printQ(priorityQueue);
        System.out.println("1------");

        List<Integer> ints= Arrays.asList(25,22,30,18,14,9,3,1,2,3,9,14,18,21,23,25);
        priorityQueue=new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);
        System.out.println("2------");

        String fact="EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings=Arrays.asList(fact.split(""));
        PriorityQueue<String> stringsPQ=new PriorityQueue<>(strings);
        QueueDemo.printQ(stringsPQ);
        System.out.println("3------");

        stringsPQ=new PriorityQueue<>(strings.size(),Collections.reverseOrder());
        stringsPQ.addAll(strings);
        QueueDemo.printQ(stringsPQ);
        System.out.println("4------");

        Set<Character> charset=new HashSet<Character>();
        for(char c:fact.toCharArray()){
            charset.add(c);
        }
        PriorityQueue<Character> characterPQ=new PriorityQueue<>(charset);
        QueueDemo.printQ(characterPQ);
        System.out.println("5------");
    }

}
