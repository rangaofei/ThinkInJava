package ninteen;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2017/2/20 0020.
 */

enum Explore{HERE,THERE}

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass){
        System.out.println("------Ananlyzing "+enumClass+"------");
        System.out.println("Interfaces:");
        for(Type t: enumClass.getGenericInterfaces()){
            System.out.println(t);
        }
        System.out.println("Base: "+enumClass.getSuperclass());
        System.out.println("Methods:");
        Set<String> methods=new TreeSet<>();
        for(Method m:enumClass.getMethods()){
            methods.add(m.getName());
        }
        System.out.println(methods);
        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMthods=analyze(Explore.class);
        Set<String> enumMethods=analyze(Enum.class);
        System.out.println("Explore.containsAll(Enum)? "+exploreMthods.containsAll(enumMethods));
        System.out.println(exploreMthods);
        System.out.println("Explore.removeAll(Enum): ");
        exploreMthods.removeAll(enumMethods);
        System.out.println(exploreMthods);
    }
}
