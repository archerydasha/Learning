package wildcards;

import com.google.common.collect.Lists;
import generics.wildcards.NumberUtils;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

/**
 * Created by Dasha on 9/14/2016.
 */
public class WildcardsTest {
    @Test
    public void testSuccessfulCollectionConversion() {
        List<Integer> integerList = Lists.newArrayList(1, 2, 3, 4, 5);
        List<Double> doubleList = Lists.newArrayList(6.5, 7.5, 8.5);
        assertEquals(15, NumberUtils.findSumWithWildcards(integerList), 0.000001);
        assertEquals(22.5, NumberUtils.findSumWithWildcards(doubleList), 0.000001);
    }

    @Test
    public void testFailingWithNoWildcards() {
        List<Integer> integerList = Lists.newArrayList(1, 2, 3, 4, 5);
        /* won't compile
        assertEquals(15, NumberUtils.findSumWithoutWildcards(integerList),0.000001);
         */
    }
}
