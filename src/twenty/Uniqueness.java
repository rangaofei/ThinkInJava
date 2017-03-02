package twenty;

/**
 * Created by Administrator on 2017/3/1 0001.
 */
public @interface Uniqueness {
    Constaraints constraints() default @Constaraints(unique = true);
}
