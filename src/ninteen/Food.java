package ninteen;

/**
 * Created by Administrator on 2017/2/20 0020.
 */
public interface Food {
    enum Appetizer implements Food{
        SALAD,SOUP,SPRING_ROLLS;
    }

    enum MainCourse implements Food{
        LASANGE,BURRITO,PAD_THAI,LENTILS,HUMMOUS,VINDALOO;
    }

    enum Dessert implements Food{
        TIRAMISU,GELATO,BLACK_FORESt_CAKE,FRUIT,CREME_CARMEL;
    }

    enum Coffee implements Food{
        BLACK_OFFEE,DECAF_COFFEE,ESPRESSO,LATTE,CAPPUCINO;
    }
}
