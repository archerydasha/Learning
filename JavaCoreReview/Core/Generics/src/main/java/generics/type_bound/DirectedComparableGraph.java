package generics.type_bound;

/**
 * Created by Dasha on 9/13/2016.
 */
public class DirectedComparableGraph extends DirectedGraph implements Comparable<DirectedComparableGraph>{

    public DirectedComparableGraph(int numberOfVertices) {
        super(numberOfVertices);
    }

    @Override
    public int compareTo(DirectedComparableGraph o) {
        return numberOfVertices - o.getNumberOfVertices();
    }
}
