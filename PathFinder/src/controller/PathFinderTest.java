package controller;

import model.Edge;
import model.Graph;
import model.Node;
import org.junit.Ignore;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Olena_Syrota
 * Date: 10/18/13
 * Time: 6:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class PathFinderTest {

    @Test
    public void testCalculate()  {
        Graph graph = new Graph();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        List nodes = graph.getNodes();
        nodes.add(first);
        nodes.add(second);
        nodes.add(third);
        nodes.add(fourth);
        Edge firstSecond = new Edge(first,second,1);
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
        Node start = graph.getNodes().get(0);
        Node finish = graph.getNodes().get(3);
        List real = PathFinder.calculate(graph,start,finish);
        List expected = new LinkedList();
        expected.add(firstSecond);
        expected.add(secondThird);
        expected.add(thirdForth);
        assertEquals(expected,real);
    }




    @Test
    public void testCalculate_2()  {
        Graph graph = new Graph();
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
        Node start = graph.getNodes().get(0);
        Node finish = graph.getNodes().get(3);
        List real = PathFinder.calculate(graph,start,finish);
        List expected = new LinkedList();
        expected.add(firstThird);
        expected.add(thirdForth);
        assertEquals(expected,real);
    }


    @Test
    public void testCalculate_3()  {
        Graph graph = new Graph();
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
        Edge firstThird = new Edge(first,third,500);
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
        Node start = graph.getNodes().get(0);
        Node finish = graph.getNodes().get(3);
        List real = PathFinder.calculate(graph,start,finish);
        List expected = new LinkedList();
        expected.add(firstForth);
        assertEquals(expected,real);
    }

    @Test
    public void testNodeContainsEdge_NodeStart() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node2, 0);
        boolean expected = true;
        boolean real = PathFinder.edgeContainsNode(node1, edge);
        assertEquals(expected, real);

    }

    @Test
    public void testNodeContainsEdge_NodeFinish() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node2, 0);
        boolean expected = true;
        boolean real = PathFinder.edgeContainsNode(node2, edge);
        assertEquals(expected, real);

    }

    @Test
    public void testNodeContainsEdge_NotContaining() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node1, 0);
        boolean expected = false;
        boolean real = PathFinder.edgeContainsNode(node2, edge);
        assertEquals(expected, real);

    }

    @Test
    public void testGetEdgeFinish_NodeStart() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node2, 0);
        Node result = PathFinder.getEdgeFinish(node1, edge);
        assertEquals(node2, result);

    }

    @Test
    public void testGetEdgeFinish_NodeFinish() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node2, 0);
        Node result = PathFinder.getEdgeFinish(node2,edge);
        assertEquals(node1, result);

    }

    @Test
    public void testGetEdgeFinish_NotContaining() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node1, 0);
        Node result = PathFinder.getEdgeFinish(node2,edge);
        assertEquals(null, result);
    }

    @Test
    public void testGetEdgeFinish_Loop() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Edge edge = new Edge(node1, node1, 0);
        Node result = PathFinder.getEdgeFinish(node1,edge);
        assertEquals(node1, result);
    }

    @Test
    public void testStopCriteria() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        nodes.add(node1);
        nodes.add(node2);
        Graph graph = new Graph(null, nodes);
        boolean expected = true;
        boolean real =  PathFinder.stopCriteria(graph);
        assertEquals(expected, real);
    }

    @Test
    public void testStopCriteria_OneVisited() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.setVisited(true);
        nodes.add(node1);
        nodes.add(node2);
        Graph graph = new Graph(null, nodes);
        boolean expected = true;
        boolean real =  PathFinder.stopCriteria(graph);
        assertEquals(expected, real);
    }

    @Test
    public void testStopCriteria_AllVisited() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.setVisited(true);
        node2.setVisited(true);
        nodes.add(node1);
        nodes.add(node2);
        Graph graph = new Graph(null, nodes);
        boolean expected = false;
        boolean real =  PathFinder.stopCriteria(graph);
        assertEquals(expected, real);
    }

    @Test
    public void testStopCriteria_EmptyNodes() {
        Graph graph = new Graph();
        boolean expected = false;
        boolean real =  PathFinder.stopCriteria(graph);
        assertEquals(expected, real);
    }

    @Test
    public void testGetMinimumPriceNode() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        node1.setCurrentPrice(1);
        Node node2 = new Node(2);
        node2.setCurrentPrice(0);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        Graph graph = new Graph(null, nodes);
        Node real =  PathFinder.getMinimumPriceNode(graph);
        assertEquals(node2, real);
    }

    @Test
    public void testGetMinimumPriceNode_AllButOneInfinity() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        node1.setCurrentPrice(10000000);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        Graph graph = new Graph(null, nodes);
        Node real =  PathFinder.getMinimumPriceNode(graph);
        assertEquals(node1, real);
    }

    @Test
    public void testGetMinumumPriceNode_AllInfinity_NoNullPointer() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        Graph graph = new Graph(null, nodes);
        Node result =  PathFinder.getMinimumPriceNode(graph);
        boolean real = result == null;
        boolean expected = false;
        assertEquals(expected, real);
    }

    @Test
    public void testFindReachableNeighbourEdge() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        List edges = new LinkedList();
        Edge edge1 = new Edge(node1, node2, 5);
        edges.add(edge1);
        Graph graph = new Graph(edges, nodes);
        Edge real = PathFinder.getReachableNeighbour(graph, node1);
        Edge expected = edge1;
        assertEquals(expected, real);
    }

    @Test
    public void testFindReachableNeighbourEdge_reverseOrder() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        List edges = new LinkedList();
        Edge edge1 = new Edge(node1, node2, 5);
        edges.add(edge1);
        Graph graph = new Graph(edges, nodes);
        Edge real = PathFinder.getReachableNeighbour(graph, node2);
        Edge expected = edge1;
        assertEquals(expected, real);
    }

    @Test
    public void testFindReachableNeighbourEdge_MoreThanOneEdge() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        List edges = new LinkedList();
        Edge edge1 = new Edge(node1, node2, 5);
        Edge edge2 = new Edge(node1, node3, 8);
        Edge edge3 = new Edge(node1, node1, 2);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge1);
        Graph graph = new Graph(edges, nodes);
        Edge real = PathFinder.getReachableNeighbour(graph, node2);
        Edge expected = edge1;
        assertEquals(expected, real);
    }

    @Test
    public void testFindReachableNeighbourEdge_NoEdges() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        List edges = new LinkedList();
        Graph graph = new Graph(edges, nodes);
        Edge real = PathFinder.getReachableNeighbour(graph, node2);
        Edge expected = null;
        assertEquals(expected, real);
    }

    @Test
    public void testFindReachableNeighbourEdge_NoAvialibleEdges() {
        List nodes = new LinkedList();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        nodes.add(node1);
        nodes.add(node2);
        nodes.add(node3);
        List edges = new LinkedList();
        Edge edge2 = new Edge(node1, node3, 8);
        Edge edge3 = new Edge(node1, node1, 2);
        edges.add(edge2);
        edges.add(edge3);
        Graph graph = new Graph(edges, nodes);
        Edge real = PathFinder.getReachableNeighbour(graph, node2);
        Edge expected = null;
        assertEquals(expected, real);
    }


}
