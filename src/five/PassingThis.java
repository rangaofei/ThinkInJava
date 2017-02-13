package five;

/**
 * Created by saka on 2017/2/10.
 */

class Person{
    public void eat(Apple apple){
        Apple peeled=apple.getPeeled();
    }
}

class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

public class PassingThis {
    public static void main(String[] args) {
        new Person().eat(new Apple());
    }

}
