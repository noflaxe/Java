package model;

import java.util.LinkedList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: noflaxe
 * Date: 02.10.13
 * Time: 22:09
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    private int id;
    private boolean visited;
    private List<Edge> currentPath;
    private int currentPrice;


    public Node(int id) {
        this.id = id;
        currentPath = new LinkedList<Edge>();
        this.currentPrice = Integer.MAX_VALUE;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void increasePrice(int price){

    }

    public List<Edge> getCurrentPath() {
        return currentPath;
    }

    public void setCurrentPath(List<Edge> currentPath) {
        this.currentPath = currentPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Node node = (Node) o;

        if (id != node.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                '}';
    }
}
