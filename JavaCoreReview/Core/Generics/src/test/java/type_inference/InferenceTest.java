package type_inference;

import generics.type_inference.InferenceUtils;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Dasha on 9/13/2016.
 */
public class InferenceTest {
    @Test
    public void testSimpleInference(){
        Integer biggest = InferenceUtils.pickBiggest(1, 2);
        assertEquals(biggest, new Integer(2));
        /* won't compile:
        Integer biggest1 = InferenceUtils.pickBiggest(1, "hi"); */
    }
}
