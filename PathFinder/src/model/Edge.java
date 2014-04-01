package model;

/**
 * Created with IntelliJ IDEA.
 * User: noflaxe
 * Date: 02.10.13
 * Time: 22:11
 * To change this template use File | Settings | File Templates.
 */
public class Edge {

    private Node start;
    private Node finish;
    private int price;

    public Edge(Node start, Node finish, int price) {
        this.start = start;
        this.finish = finish;
        this.price = price;
    }

    public Edge() {
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public Node getFinish() {
        return finish;
    }

    public void setFinish(Node finish) {
        this.finish = finish;
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

        Edge edge = (Edge) o;

        if (!finish.equals(edge.finish)) return false;
        if (!start.equals(edge.start)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = start.hashCode();
        result = 31 * result + finish.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "start=" + start +
                ", finish=" + finish +
                ", price=" + price +
                '}';
    }
}
