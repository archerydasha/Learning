package unmodifiable_or_immutable_collections;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;

/**
 * Created by Dasha on 9/16/2016.
 */
public class UnmodifiableVSImmutableTest {
    @Test
    public void testCollectionMutation(){
        List<String> strings = Lists.newArrayList("hello");
        List<String> unmodifiableValue = Collections.unmodifiableList(strings);
        List<String> immutableValue = ImmutableList.copyOf(strings);
        assertEquals(unmodifiableValue.size(), 1);
        assertEquals(immutableValue.size(), 1);
        strings.add(", world!");
        assertEquals(unmodifiableValue.size(), 2);
        assertEquals(immutableValue.size(), 1);
    }

    private class Cat{
        String name;

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    @Test
    public void testUnmodifiableElementMutation(){
        List<Cat> cats = Lists.newArrayList(new Cat("Yuki"), new Cat("Eaton"));
        List<Cat> unmodifiableValue = Collections.unmodifiableList(cats);
        unmodifiableValue.get(0).setName("Beautiful Yuki");
        assertEquals("Beautiful Yuki", unmodifiableValue.get(0).getName());
        assertEquals("Beautiful Yuki", cats.get(0).getName());
    }

    @Test
    public void testImmutableElementMutation(){
        List<Cat> cats = Lists.newArrayList(new Cat("Yuki"), new Cat("Eaton"));
        List<Cat> immutableValue = ImmutableList.copyOf(cats);
        immutableValue.get(0).setName("White Yuki");
        assertEquals("White Yuki", immutableValue.get(0).getName());
        assertEquals("White Yuki", cats.get(0).getName());
    }

    @Test
    public void tryOutBuilder(){
        ImmutableList.Builder<String> builder = ImmutableList.builder();
        builder.add("Mushrooms").add("Cottage cheese").add("Aged cheddar");
        List<String> perfectMushroomsRecipe = builder.build();
        assertEquals(Lists.newArrayList("Mushrooms","Cottage cheese", "Aged cheddar"), perfectMushroomsRecipe);
    }
}
