package eleven;

import java.util.Stack;

/**
 * Created by Administrator on 2017/2/14 0014.
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        for(String s:"My dog has fleas".split(" ")){
            stack.push(s);
        }
        for(String s:stack){
            System.out.println(s);
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

}
