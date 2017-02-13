package nine;

/**
 * Created by Administrator on 2017/2/13 0013.
 */
public class NestingInterfaces {
    public class BImp implements A.B{

        @Override
        public void f() {

        }
    }

    class CImp implements A.C{

        @Override
        public void f() {

        }
    }

    class EImp implements E{

        @Override
        public void g() {

        }
    }

    class EGImp implements E.G{

        @Override
        public void f() {

        }
    }

    class EImp2 implements E{

        @Override
        public void g() {

        }
    }

    public static void main(String[] args) {
        A a=new A();
        A a2=new A();
        a2.received(a.getD());
    }
}
