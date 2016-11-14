package generics.type_bound;

/**
 * Created by Dasha on 9/12/2016.
 */
public class GraphUtils {
    public GraphUtils(){};

    public static <T extends Graph & Comparable<T>> int compareTwoGraphs(T graph1, T graph2){
        return graph1.compareTo(graph2);
    }

}
