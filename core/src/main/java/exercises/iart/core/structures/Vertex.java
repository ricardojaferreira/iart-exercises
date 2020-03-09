package exercises.iart.core.structures;

import java.util.LinkedList;
import java.util.List;

public abstract class Vertex<V> {
    private V content;
    private List<Edge<V>> adjacent;
    private boolean discovered;

    public Vertex(V content) {
        this.content = content;
        this.adjacent = new LinkedList<>();
        this.discovered = false;
    }

    public V getContent() {
        return this.content;
    }

    public void setDiscovered() {
        this.discovered = true;
    }

    public boolean wasDiscovered() {
        return this.discovered;
    }

    public List<Edge<V>> getAdjacent() {
        return this.adjacent;
    }

    public void addEdge(Vertex<V> vertex, double weight) {
        adjacent.add(new Edge<>(vertex, weight));
    }

    public void addEdge(Edge<V> edge) {
        adjacent.add(edge);
    }

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract int hashCode();
}
