package model;

import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: noflaxe
 * Date: 02.10.13
 * Time: 22:21
 * To change this template use File | Settings | File Templates.
 */
public class Path {

    private Queue<Edge> path;
    private int price;

    public Path(int price, Queue<Edge> path) {
        this.price = price;
        this.path = path;
    }

    public Queue<Edge> getPath() {
        return path;
    }

    public void setPath(Queue<Edge> path) {
        this.path = path;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Path path1 = (Path) o;

        if (path != null ? !path.equals(path1.path) : path1.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return path != null ? path.hashCode() : 0;
    }
}
