package exercises.iart.core.traversals;

import exercises.iart.core.structures.Edge;
import exercises.iart.core.structures.Graph;
import exercises.iart.core.structures.Vertex;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public abstract class BreadthFirst<V> implements TraversalStrategy<V> {

    @Override
    public abstract boolean reachObjective(Graph<V> graph, Vertex<V> vertex);

    @Override
    public Set<Vertex<V>> getTraversal(Graph<V> graph, Vertex<V> root) {
        Set<Vertex<V>> expansion = new LinkedHashSet<>();
        Queue<Vertex<V>> queue = new LinkedList<>();
        queue.add(root);
        expansion.add(root);
        root.setDiscovered();

        while (!queue.isEmpty()) {
            Vertex<V> vertex = queue.poll();
            if (reachObjective(graph, vertex)) {
                return expansion;
            }
            for (Edge<V> e: vertex.getAdjacent()) {
                if (!expansion.contains(e.getDestination())) {
                    queue.add(e.getDestination());
                    expansion.add(e.getDestination());
                    e.getDestination().setDiscovered();
                }
            }
        }
        return new LinkedHashSet<>();
    }

    public double getTraversalCost(Set<Vertex<V>> traversalExpansion) {
        return 10;
    }



}
