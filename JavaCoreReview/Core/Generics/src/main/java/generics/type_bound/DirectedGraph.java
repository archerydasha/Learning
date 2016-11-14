package generics.type_bound;

/**
 * Created by Dasha on 9/12/2016.
 */
public class DirectedGraph extends Graph{
    private static String GRAPH_DESCRIPTION = "Directed Graph";
    private static String SCC_DESCRIPTION = "Connected components are be equivalence classes of relation: there is a path from u to v and there is a path from v to u \n" +
            "So in the connected component there will be a path from every vertex u to every vertex v";
    public DirectedGraph(int numberOfVertices)
    {
        super(SCC_DESCRIPTION, GRAPH_DESCRIPTION, numberOfVertices);
    }

}
