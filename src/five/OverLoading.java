package five;

/**
 * Created by saka on 2017/2/10.
 */

class Tree{
    int height;
    Tree(){
        System.out.println("Planting a seeding");
        height=0;
    }

    Tree(int initialHeight){
        height=initialHeight;
        System.out.println("Creating new Tree is "+initialHeight+" feet tall");
    }
    void info(){
        System.out.println("Tree is "+height+" feet tall");
    }

    void info(String s){
        System.out.println(s+": Tree is "+height+" feet tall");
    }
}

public class OverLoading {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            Tree t=new Tree(i);
            t.info();
            t.info("over loaded method");
        }
    }
}
