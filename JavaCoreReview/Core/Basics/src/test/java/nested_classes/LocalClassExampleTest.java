package nested_classes;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Dasha on 9/16/2016.
 */
public class LocalClassExampleTest {
    @Test
    public void testLocalClass(){
        assertEquals("1234567890", LocalClassExample.validatePhoneNumber("123-456-7890"));
        assertEquals(null, LocalClassExample.validatePhoneNumber("456-7890"));
    }
}
