package generics.generic_type;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static org.junit.Assert.*;


/**
 * Created by Dasha on 9/12/2016.
 */
public class BoxTest {
    @Test
    public void testBox(){
        Box<Integer> integerBox = new Box<>();
        integerBox.setContent(5);
        assertTrue(integerBox.getContent() instanceof Integer);
        assertTrue(Objects.equals(integerBox.getContent(), 5));
    }

    @Test(expected = ClassCastException.class)
    public void testClassCastException(){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        List someList = integerList;
        someList.add("hello");
        for(Integer i : integerList){
            System.out.println(i);
        }
    }
}
