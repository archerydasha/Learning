package generics.generic_method;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Dasha on 9/12/2016.
 */
public class PairUtilsUsageTest {
    @Test
    public void tryOutUtilsUsage(){
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<Integer, String> pair2 = new Pair<>(2, "Two");
        Pair<Integer, String > pair3 = new Pair<>(1, "One");
        assertTrue(PairUtils.compare(pair1, pair3));
        assertFalse(PairUtils.compare(pair1, pair2));
    }

    @Test
    public void troToBreakUtilsUsage(){
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        Pair<String, Boolean> pair2 = new Pair<>("Earth is flat", false);
        /*will not compile following line:
        /assertFalse(PairUtils.compare(pair1, pair2));*/
    }
}
