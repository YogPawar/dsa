package com.misc.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import org.w3c.dom.Node;

public class BinarySearchTree {

  public Node root;

  public boolean rContains(int i) {
    return rContains(root, i);
  }

  private boolean rContains(Node root, int value) {
    if (root == null) {
      return false;
    }
    if (root.value == value) {
      return true;
    }

    if (root.value > value) {
      return rContains(root.left, value);
    } else {
      return rContains(root.right, value);
    }
  }

  public Node rInsert(int value) {
    if (root == null) {
      root = new Node(value);
    }
    return rInsert(root, value);
  }

  public Node rDelete(int value) {
    return rDelete(root, value);
  }

  private Node rDelete(Node currentNode, int value) {
    if (currentNode == null) {
      return null;
    }
    if (value < currentNode.value) {
      currentNode.left = rDelete(currentNode.left, value);
    } else if (value > currentNode.value) {
      currentNode.right = rDelete(currentNode.right, value);
    } else {
      if (currentNode.left == null && currentNode.right == null) {
        return null;
      } else if (currentNode.left == null) {
        currentNode = currentNode.right;
      } else if (currentNode.right == null) {
        currentNode = currentNode.left;
      } else {
        int subTreeMin = minValue(currentNode.right);
        currentNode.value = subTreeMin;
        currentNode.right = rDelete(currentNode.right, subTreeMin);
      }

    }
    return currentNode;
  }

  public int minValue(Node currnetNode) {
    while (currnetNode.left != null) {
      currnetNode = currnetNode.left;
    }
    return currnetNode.value;
  }

  private Node rInsert(Node currentNode, int value) {
    if (currentNode == null) {
      return new Node(value);
    }
    if (value < currentNode.value) {
      currentNode.left = rInsert(currentNode.left, value);
    } else {
      currentNode.right = rInsert(currentNode.right, value);
    }
    return currentNode;
  }

  public class Node {

    public int value;
    public Node left;
    public Node right;

    Node(int value) {
      this.value = value;
    }
  }

  public boolean insert(int value) {
    Node newNode = new Node(value);
    if (root == null) {
      root = newNode;
      return true;
    }
    Node temp = root;
    while (true) {
      if (newNode.value == temp.value) {
        return false;
      }
      if (newNode.value < temp.value) {
        if (temp.left == null) {
          temp.left = newNode;
          return true;
        }
        temp = temp.left;
      } else {
        if (temp.right == null) {
          temp.right = newNode;
          return true;
        }
        temp = temp.right;
      }
    }
  }

  public boolean contains(int value) {
    if (root == null) {
      return false;
    }
    Node temp = root;
    while (temp != null) {
      if (value < temp.value) {
        temp = temp.left;
      } else if (value > temp.value) {
        temp = temp.right;
      } else {
        return true;
      }
    }
    return false;
  }

  //Breadth First Search Traverse

  public ArrayList<Integer> BFS() {
    Node currentNode = root;
    Queue<Node> nodeQueue = new LinkedList<>();
    ArrayList<Integer> result = new ArrayList<>();
    nodeQueue.add(currentNode);
    while (nodeQueue.size() > 0) {
      currentNode = nodeQueue.remove();
      result.add(currentNode.value);
      if (currentNode.left != null) {
        nodeQueue.add(currentNode.left);
      }
      if (currentNode.right != null) {
        nodeQueue.add(currentNode.right);
      }
    }
    return result;
  }

  //DFS PreOrder Traverse
  public ArrayList<Integer> DFSPreOrder() {
    ArrayList<Integer> result = new ArrayList<>();

    class Traverse {

      Traverse(Node currentNode) {
        result.add(currentNode.value);
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
      }
    }
    new Traverse(root);
    return result;
  }

  public ArrayList<Integer> DFSPostOrder() {
    ArrayList<Integer> result = new ArrayList<>();
    class Traverse {

      Traverse(Node currentNode) {
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }

        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
        result.add(currentNode.value);
      }
    }
    new Traverse(root);
    return result;
  }

  public ArrayList<Integer> DFSInorder() {
    ArrayList<Integer> result = new ArrayList<>();
    class Traverse {

      Traverse(Node currentNode) {
        if (currentNode.left != null) {
          new Traverse(currentNode.left);
        }
        result.add(currentNode.value);
        if (currentNode.right != null) {
          new Traverse(currentNode.right);
        }
      }
    }
    new Traverse(root);
    return result;
  }
}
