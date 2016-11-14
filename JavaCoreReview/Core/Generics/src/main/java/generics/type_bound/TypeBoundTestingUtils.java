package generics.type_bound;

/**
 * Created by Dasha on 9/12/2016.
 */
public class TypeBoundTestingUtils {
    public TypeBoundTestingUtils(){};
    public static <T extends Number> boolean isEven(T number){
        return number.intValue() % 2 == 0;
    }

}
