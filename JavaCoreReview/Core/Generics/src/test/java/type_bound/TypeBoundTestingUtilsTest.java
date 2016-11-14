package type_bound;

import generics.type_bound.DirectedComparableGraph;
import generics.type_bound.GraphUtils;
import generics.type_bound.TypeBoundTestingUtils;
import generics.type_bound.UndirectedGraph;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by Dasha on 9/12/2016.
 */
public class TypeBoundTestingUtilsTest {
    @Test
    public void testSuccessfulBehavior(){
        assertTrue(TypeBoundTestingUtils.isEven(4));
        assertTrue(TypeBoundTestingUtils.isEven(6l));
        assertTrue(TypeBoundTestingUtils.isEven(18.0d));
        assertFalse(TypeBoundTestingUtils.isEven(17d));
        assertFalse(TypeBoundTestingUtils.isEven(99l));
        assertFalse(TypeBoundTestingUtils.isEven(535));
    }

    @Test
    public void tryToBreakNumberUtils(){
        /* doesn't compile -
        assertTrue(TypeBoundTestingUtils.isEven("Hello"));
        */
    }

    @Test
    public void comparingGraphs(){
        DirectedComparableGraph graph1 = new DirectedComparableGraph(5);
        DirectedComparableGraph graph2 = new DirectedComparableGraph(6);
        DirectedComparableGraph graph3 = new DirectedComparableGraph(5);
        assertTrue(GraphUtils.<DirectedComparableGraph>compareTwoGraphs(graph1, graph2) < 0);
        assertTrue(GraphUtils.<DirectedComparableGraph>compareTwoGraphs(graph1, graph3) == 0);
        assertTrue(GraphUtils.<DirectedComparableGraph>compareTwoGraphs(graph2, graph3) > 0);
    }

    @Test
    public void tryToBreakComparable(){
        UndirectedGraph graph1 = new UndirectedGraph(4);
        UndirectedGraph graph2 = new UndirectedGraph(3);
        /* won't compile:
        assertTrue(GraphUtils.<UndirectedGraph>compareTwoGraphs(graph1, graph2));*/
    }
}
