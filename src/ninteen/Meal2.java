package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public enum Meal2 {
    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;

    private Meal2(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public interface Food {
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }

        enum MainCourse implements Food {
            LASANGE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
        }

        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FORESt_CAKE, FRUIT, CREME_CARMEL;
        }

        enum Coffee implements Food {
            BLACK_OFFEE, DECAF_COFFEE, ESPRESSO, LATTE, CAPPUCINO;
        }
    }

    public Food randomSelection(){
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            for(Meal2 meal:Meal2.values()){
                Food food=meal.randomSelection();
                System.out.println(food);
            }
        }
        System.out.println("------");
    }

}
