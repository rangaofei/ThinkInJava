package forteen;

/**
 * Created by Administrator on 2017/2/15.
 */

class Candy{
    static {
        System.out.println("Loading Candy");
    }
}

class Gum{
    static {
        System.out.println("Loading Gum");
    }
}

class Cookie{
    static {
        System.out.println("Loading Cookie");
    }
}

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("Inside main");
        new Candy();

        System.out.println("After loading candy");

        try {
            Class.forName("forteen.Guma");
        } catch (ClassNotFoundException e) {
            System.out.println("cannot find Gum class");
        }
        System.out.println("After loading gum");
        new Cookie();
        System.out.println("After loading cookie");
    }
}
