package com.misc.graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class GenericGraph<T> {

  private final HashMap<T, ArrayList<T>> graph = new HashMap<>();

  public boolean addVertex(T vertex) {
    if (graph.get(vertex) == null) {
      graph.put(vertex, new ArrayList<>());
      return true;
    }
    return false;
  }

  public boolean addEdge(T vertex1, T vertex2) {
    if (graph.get(vertex1) != null && graph.get(vertex2) != null) {
      graph.get(vertex1).add(vertex2);
      graph.get(vertex2).add(vertex1);
      return true;
    }
    return false;
  }

  public boolean removeEdge(T vertex1, T vertex2) {
    if (graph.get(vertex1) != null && graph.get(vertex2) != null) {
      graph.get(vertex1).remove(vertex2);
      graph.get(vertex2).remove(vertex1);
      return true;
    }
    return false;
  }

  public boolean removeVertex(T vertex) {
    if (graph.get(vertex) != null) {
      graph.get(vertex).forEach(value -> graph.get(value).remove(vertex));
      graph.remove(vertex);
      return true;
    }
    return false;
  }

  public void printGraph() {
    System.out.println(graph);
  }

}
