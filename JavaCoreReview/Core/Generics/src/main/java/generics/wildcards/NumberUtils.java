package generics.wildcards;

import java.util.List;

/**
 * Created by Dasha on 9/14/2016.
 */
public class NumberUtils {
    private NumberUtils(){}
    public static double findSumWithWildcards(List<? extends Number> numberList){
        double result = 0.0;
        for(Number n : numberList){
            result += n.doubleValue();
        }
        return result;
    }

    public static double findSumWithoutWildcards(List<Number> numberList){
        double result = 0.0;
        for(Number n : numberList){
            result += n.doubleValue();
        }
        return result;
    }
}
