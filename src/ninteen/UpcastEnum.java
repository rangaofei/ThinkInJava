package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */

enum Search{WHITE,YON}

public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals=Search.values();
        Enum e=Search.WHITE;
        for(Enum en:e.getClass().getEnumConstants()){
            System.out.println(en);
        }
    }

}
