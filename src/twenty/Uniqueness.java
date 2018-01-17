package twenty;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
