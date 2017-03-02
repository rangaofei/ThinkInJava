package forteen;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/2/23 0023.
 */
public class DynamicProxyHandler implements InvocationHandler {

    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ",method: " + method
                + ",args: " + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.print(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}

class SimpleDynamicProxy {
    public static void consumer(Interface inter) {
        inter.doSomething();
        inter.somethingElse("booo");
    }

    public static void main(String[] args) {
        RealObject realObject = new RealObject();
        consumer(realObject);

        Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
                new Class[]{Interface.class}, new DynamicProxyHandler(realObject));
        consumer(proxy);
    }
}
