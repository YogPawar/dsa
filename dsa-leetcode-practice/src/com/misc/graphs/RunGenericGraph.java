package com.misc.graphs;

import javax.swing.Spring;

public class RunGenericGraph {

  public static void main(String[] args) {
    GenericGraph<String> graph = new GenericGraph<>();
    graph.addVertex("A");
    graph.addVertex("B");
    graph.addVertex("C");
    graph.addVertex("D");
    graph.addVertex("E");
    graph.addVertex("F");

    graph.addEdge("A", "B");
    graph.addEdge("B", "C");
    graph.addEdge("C", "D");
    graph.addEdge("D", "E");
    graph.addEdge("A", "E");
    graph.addEdge("F", "B");
    graph.addEdge("F", "A");
    graph.addEdge("F", "C");
    graph.addEdge("F", "D");
    graph.addEdge("F", "E");

    graph.printGraph();
    graph.removeVertex("F");
    graph.printGraph();

  }

}