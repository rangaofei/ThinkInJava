package fifteen;

/**
 * Created by Administrator on 2017/2/17 0017.
 */
public class Holder3<T> {
    private T a;
    public Holder3(T a){
        this.a=a;
    }

    public void setA(T a){
        this.a=a;
    }

    public T getA(){
        return a;
    }

    public static void main(String[] args) {
        Holder3<Automobile> h3=new Holder3<>(new Automobile());
        Automobile a=h3.getA();
        System.out.println(a);
    }

}
