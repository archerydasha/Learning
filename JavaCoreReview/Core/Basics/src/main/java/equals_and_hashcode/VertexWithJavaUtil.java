package equals_and_hashcode;

import java.util.Objects;

/**
 * Created by Dasha on 9/15/2016.
 */
public class VertexWithJavaUtil {
    private int vertexNumber;
    private int numberOfIncidentEdges;

    public VertexWithJavaUtil(int vertexNumber, int numberOfIncidentEdges) {
        this.vertexNumber = vertexNumber;
        this.numberOfIncidentEdges = numberOfIncidentEdges;
    }

    public int getVertexNumber() {
        return vertexNumber;
    }

    public int getNumberOfIncidentEdges() {
        return numberOfIncidentEdges;
    }

    @Override
    public boolean equals(Object o){
        if( o == null) return false;
        if ( ! (o instanceof VertexWithJavaUtil)) return false;
        VertexWithJavaUtil otherVertex = (VertexWithJavaUtil) o;
        return Objects.equals(vertexNumber, otherVertex.vertexNumber) &&
                Objects.equals(numberOfIncidentEdges,  otherVertex.numberOfIncidentEdges);
    }

    @Override
    public int hashCode(){
        return Objects.hash(vertexNumber, numberOfIncidentEdges);
    }
}
