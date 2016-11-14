package wildcards;

import com.google.common.collect.Lists;
import generics.wildcards.WildcardError;
import org.junit.Test;

import java.util.List;

/**
 * Created by Dasha on 9/14/2016.
 */
public class WildcardErrorTest {
    @Test
    public void testWildcardCaptureError(){
        List<Integer> integerList = Lists.newArrayList(1,2);
        WildcardError.foo(integerList);
    }
}
