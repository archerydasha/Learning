package equals_and_hashcode;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by Dasha on 9/15/2016.
 */
public class VertexWithApacheCommons {
    private int vertexNumber;
    private int numberOfIncidentEdges;

    public VertexWithApacheCommons(int vertexNumber, int numberOfIncidentEdges) {
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
    public boolean equals(Object o) {
        if( o == null) return false;
        if (!(o instanceof VertexWithApacheCommons)) return false;
        VertexWithApacheCommons otherVertex = (VertexWithApacheCommons) o;
        return new EqualsBuilder().append(vertexNumber, otherVertex.vertexNumber)
                .append(numberOfIncidentEdges, otherVertex.numberOfIncidentEdges).isEquals();
    }

    @Override
    public int hashCode(){
        return new HashCodeBuilder().append(vertexNumber).append(numberOfIncidentEdges).toHashCode();
    }
}
