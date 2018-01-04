package thirten;

public class ExtendMatcher {
    private static String s = "java123\nJAVA";//形式为"[a-z]{4}[0-9]{3}\s[A-Z]{4}
    private static String t="1111abcd1111abcd1111abcdjava";

    public static void main(String[] args) {
//        testOne(s);
        testTwo(t);
    }

    private static void testOne(String s) {
        System.out.println(s);
        System.out.println(s.matches(".+\\s.\\S+"));//测试"."匹配任意字符与空白字符"\s与非空白字符\S"
        System.out.println(s.matches("[a-z]+[1-9]+\\s[A-Z]+"));//测试[a-zA-Z0-9]的任意匹配
        System.out.println(s.matches("[^0-9]+[^a-z]+[^\\S][^a-z]+"));//测试^（非）
        System.out.println(s.matches("[bv[ja]]+[123]+\\s[A-Z&&1JAV]+"));//测试与和或
        System.out.println(s.matches("\\w{4}\\d{3}\\s\\w{4}"));//测试\w词字符与\d数字
        System.out.println(s.matches("\\D{4}\\w{3}\\W\\D{4}"));//测试非词字符\W与非数字\D
    }

    private static void testTwo(String s){
        System.out.println(s);
        System.out.println(s.replaceAll("a.+d","EEE"));//贪婪型匹配
        System.out.println(s.replaceAll("a.+?d","EEE"));//勉强型匹配
        System.out.println(s.replaceAll("a.++d","EEE"));//勉强型匹配
    }

}
