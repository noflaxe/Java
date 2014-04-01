package controller;

import model.Graph;
import model.Node;

/**
 * Created with IntelliJ IDEA.
 * User: Nazar_Sheremeta
 * Date: 10/16/13
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Filler.fillData(graph);
        Node start = graph.getNodes().get(0);
        Node finish = graph.getNodes().get(3);


        System.out.println(PathFinder.calculate(graph, start, finish));
        System.out.println(
                "done");
    }
}
