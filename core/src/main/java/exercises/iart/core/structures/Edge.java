package exercises.iart.core.structures;

public class Edge<E> {
    private Vertex<E> destination;
    private double weight;

    public Edge(Vertex<E> destination, double weight) {
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex<E> getDestination() {
        return this.destination;
    }

    public double getWeight() {
        return this.weight;
    }

}
