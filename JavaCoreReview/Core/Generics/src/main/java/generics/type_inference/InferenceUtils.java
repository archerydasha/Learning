package generics.type_inference;

/**
 * Created by Dasha on 9/13/2016.
 */
public class InferenceUtils {
    public static <T extends Comparable<T>> T pickBiggest(T t1, T t2) {
        return t1.compareTo(t2) >= 0 ? t1 : t2;
    }
}
