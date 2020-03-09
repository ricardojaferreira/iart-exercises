package exercises.iart.core.structures;

import java.util.ArrayList;
import java.util.List;

public class Graph<V> {
    private List<Vertex<V>> vertexList;

    public Graph() {
        this.vertexList = new ArrayList<>();
    }

    public void addVertex(Vertex<V> vertex) {
        this.vertexList.add(vertex);
    }



}
