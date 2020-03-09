package exercises.iart.core.traversals;

import exercises.iart.core.structures.Graph;
import exercises.iart.core.structures.Vertex;

import java.util.Set;

public interface TraversalStrategy<V> {
    boolean reachObjective(Graph<V> graph, Vertex<V> vertex);
    Set<Vertex<V>> getTraversal(Graph<V> graph, Vertex<V> root);
    double getTraversalCost(Set<Vertex<V>> traversalExpansion);
}
