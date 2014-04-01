/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Edge;
import model.Graph;
import model.Node;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Nazar_Sheremeta
 */
public class PathFinder {


    public static List<Edge> calculate(Graph graph, Node start,Node finish){
        start.setCurrentPrice(0);
        boolean stop = true;
        while (stop) {
            stop = stopCriteria(graph);
            Node current = getMinimumPriceNode(graph);
            Edge edge;
            do{
                edge = getReachableNeighbour(graph, current);
                if(edge == null){
                    break;
                }

                proposeNewPath(current, edge);
                graph.getEdges().remove(edge);
            }       while (edge != null);

            if (current != null) {
                current.setVisited(true);
            }
        }
        return finish.getCurrentPath();
    }

    static void proposeNewPath(Node current, Edge edge) {
        Node target = getEdgeFinish(current, edge);

        if (target.getCurrentPrice() > current.getCurrentPrice() + edge.getPrice()) {
            List<Edge> path = new LinkedList<Edge>(current.getCurrentPath());
            path.add(edge);
            target.setCurrentPath(path);
            target.setCurrentPrice(current.getCurrentPrice() + edge.getPrice());
        }
    }

    static Node getEdgeFinish(Node current, Edge edge) {
        Node target = null;
        if (edge.getStart().equals(current)) {
            target = edge.getFinish();
        }
        if (edge.getFinish().equals(current)) {
            target = edge.getStart();
        }
        return target;
    }

    static Edge getReachableNeighbour(Graph graph, Node current) {
        Edge edge;
        edge = null;
        for (Edge e : graph.getEdges()) {
            boolean flag = false;
            if (e.getStart().equals(current)) {
                flag = !e.getFinish().isVisited();
            }
            if (e.getFinish().equals(current)) {
                flag = !e.getStart().isVisited();
            }
            boolean edgeContainsNode = edgeContainsNode(current, e);
            if (flag && edgeContainsNode) {
                edge = e;
                break;
            }
        }
        return edge;
    }

    static boolean edgeContainsNode(Node current, Edge e) {
        return e.getStart().equals(current) || e.getFinish().equals(current);
    }

     static Node getMinimumPriceNode(Graph graph) {
        Node current = null;
        int min = Integer.MAX_VALUE;
        for (Node n : graph.getNodes()) {
            if (n.isVisited() == false) {
                int currentPrice = n.getCurrentPrice();
                if (currentPrice <= min) {
                    min = n.getCurrentPrice();
                    current = n;
                }
            }
        }
        return current;
    }

    static boolean stopCriteria(Graph graph) {
        boolean stop;
        stop = false;
        for (Node n : graph.getNodes()) {
            if (n.isVisited() == false) {
                stop = true;
            }
        }
        return stop;
    }


}
