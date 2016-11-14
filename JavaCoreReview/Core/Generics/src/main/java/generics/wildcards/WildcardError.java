package generics.wildcards;

import java.util.List;

/**
 * Created by Dasha on 9/14/2016.
 */
public class WildcardError {
    public static void foo(List<?> aList){
        /*won't compile
        aList.set(0, aList.get(0));*/
        fooHelp(aList);
    }

    private static <T> void fooHelp(List<T> aList) {
        aList.set(0, aList.get(0));
    }
}
