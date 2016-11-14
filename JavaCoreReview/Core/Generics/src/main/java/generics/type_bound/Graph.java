package generics.type_bound;

/**
 * Created by Dasha on 9/12/2016.
 */
public abstract class Graph {
    private String graphDescription;
    private String sccDescription;
    protected int numberOfVertices;


    public Graph(String graphDescription, String sccDescription, int numberOfVertices) {
        this.graphDescription = graphDescription;
        this.sccDescription = sccDescription;
        this.numberOfVertices = numberOfVertices;
    }

    public String getConnectedComponentsDescription(){
        return sccDescription;
    }

    public String getGraphDescription() {
        return graphDescription;
    }

    public int getNumberOfVertices() {
        return numberOfVertices;
    }
}
