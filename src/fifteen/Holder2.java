package fifteen;

public class Holder2 {
    private Object a;
    public Holder2(Object a){
        this.a=a;
    }

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public static void main(String[] args) {
        Holder2 holder2=new Holder2(new Automobile());
        Automobile a= (Automobile) holder2.getA();
        holder2.setA("Not an AutoMobile");
        String s= (String) holder2.getA();
        System.out.println(s);
        holder2.setA(1);
        Integer x= (Integer) holder2.getA();
        System.out.println(x);
    }
}
