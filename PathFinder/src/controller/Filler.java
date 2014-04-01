package controller;

import model.Edge;
import model.Graph;
import model.Node;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Nazar_Sheremeta
 * Date: 10/16/13
 * Time: 4:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Filler {

    private Filler(){

    }
    public static void fillData(Graph graph){
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        List nodes = graph.getNodes();
        nodes.add(first);
        nodes.add(second);
        nodes.add(third);
        nodes.add(fourth);
        Edge firstSecond = new Edge(first,second,100);
        Edge firstThird = new Edge(first,third,5);
        Edge firstForth= new Edge(first,fourth,15);
        Edge secondThird= new Edge(second,third,3);
        Edge secondForth= new Edge(second,fourth,12);
        Edge thirdForth= new Edge(third,fourth,3);
        List edges = graph.getEdges();
        edges.add(firstSecond);
        edges.add(firstThird);
        edges.add(firstForth);
        edges.add(secondThird);
        edges.add(secondForth);
        edges.add(thirdForth);
    }
}
