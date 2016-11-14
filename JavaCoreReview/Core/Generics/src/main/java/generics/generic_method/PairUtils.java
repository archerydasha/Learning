package generics.generic_method;

import java.util.Objects;

/**
 * Created by Dasha on 9/12/2016.
 */
public class PairUtils{
    public static <K,V> boolean compare(Pair<K,V> pair1, Pair<K,V> pair2){
        return Objects.equals(pair1.getKey(), pair2.getKey()) &&
                Objects.equals(pair1.getValue(), pair2.getValue());
    }
}
