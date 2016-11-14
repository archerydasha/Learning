package generics.type_bound;

/**
 * Created by Dasha on 9/12/2016.
 */
public class UndirectedGraph extends Graph {
    private static String GRAPH_DESCRIPTION = "Undirected graph.";
    private static String SCC_DESCRIPTION = "Connected components are be equivalence classes of relation: there is a path from u to v";
    public UndirectedGraph(int numberOfVertices) {
        super(SCC_DESCRIPTION, GRAPH_DESCRIPTION, numberOfVertices);
    }
}
