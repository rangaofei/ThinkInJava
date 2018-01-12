package seventeen;

import java.util.*;

public class Lists {
    private static boolean b;
    private static String s;
    private static int i;
    private static Iterator<String> it;
    private static ListIterator<String> lit;

    public static void basicTest(List<String> a) {
        a.add(1, "x");
        a.add("x");
        a.addAll(Countries.names(25));
        a.addAll(3, Countries.names(25));
        b = a.contains("1");
        b = a.containsAll(Countries.names(25));
        s = a.get(1);
        i = a.indexOf("1");
        b = a.isEmpty();
        it = a.iterator();
        lit = a.listIterator();
        lit = a.listIterator(3);
        i = a.lastIndexOf("1");
        a.remove(1);
        a.remove("3");
        a.set(1, "y");
        a.retainAll(Countries.names(25));
        a.retainAll(Countries.names(25));
        i = a.size();
        a.clear();
    }

    public static void iterMotion(List<String> a) {
        ListIterator<String> it = a.listIterator();
        b = it.hasNext();
        b = it.hasPrevious();
        s = it.next();
        i = it.nextIndex();
        s = it.previous();
        i = it.previousIndex();
    }

    public static void iterManipulation(List<String> a) {
        ListIterator<String> it = a.listIterator();
        it.add("47");
        it.next();
        it.remove();
        it.next();
        it.set("47");
    }

    public static void main(String[] args) {
        List<String> test = new ArrayList<String>(Arrays.asList("A B C D E F G".split(" ")));
        List<String> a = new ArrayList<>();
        a.add("W");
        test.addAll(3, a);
        System.out.println(test);
    }
}
