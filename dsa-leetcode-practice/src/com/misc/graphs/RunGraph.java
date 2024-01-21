package com.misc.graphs;

public class RunGraph {

  public static void main(String[] args) {
    Graph graph = new Graph();
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

    System.out.println(graph.adjList);

    graph.removeVertex("F");
    System.out.println(graph.adjList);
  }

}
