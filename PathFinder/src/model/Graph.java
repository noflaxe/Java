package model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: noflaxe
 * Date: 02.10.13
 * Time: 22:13
 * To change this template use File | Settings | File Templates.
 */
public class Graph {

 private List<Node> nodes;
 private List<Edge> edges;

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public void setEdges(List<Edge> edges) {
        this.edges = edges;
    }

    public Graph(List<Edge> edges, List<Node> nodes) {
        this.edges = edges;
        this.nodes = nodes;
    }

    public Graph() {
        nodes = new LinkedList<Node>();
        edges = new LinkedList<Edge>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Graph graph = (Graph) o;

        if (edges != null ? !edges.equals(graph.edges) : graph.edges != null) return false;
        if (nodes != null ? !nodes.equals(graph.nodes) : graph.nodes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nodes != null ? nodes.hashCode() : 0;
        result = 31 * result + (edges != null ? edges.hashCode() : 0);
        return result;
    }
}
