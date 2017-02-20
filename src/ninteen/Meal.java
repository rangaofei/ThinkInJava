package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public class Meal {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(Course course:Course.values()){
                Food food=course.randomSelection();
                System.out.println(food);
            }
        }
    }

}
