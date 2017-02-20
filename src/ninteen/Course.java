package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public enum Course {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;
    private Course(Class<? extends Food> kind){
        values=kind.getEnumConstants();
    }

    public Food randomSelection(){
        return Enums.random(values);
    }

}
