package equals_and_hashcode.impl1;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by Dasha on 9/15/2016.
 */
public class EqualsAndHashcodeTest {
    @Test
    public void testInstanceOf(){
        A a = new A("hello");
        B b = new B("hello", 3);
        B b2 = new B("hello", 3);
        B b3 = new B("hello", 67);
        assertTrue(b instanceof A);
        assertFalse(a instanceof B);
        assertTrue(A.class.isAssignableFrom(B.class));
        assertFalse(B.class.isAssignableFrom(A.class));
        //reflexive
        assertTrue(a.equals(a));
        assertTrue(b.equals(b));
        //symmetric
        assertTrue(a.equals(b));
        assertTrue(b.equals(a));
        //transitive
        assertTrue(b.equals(b2));
        assertTrue(a.equals(b2));
    }
}
