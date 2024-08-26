package com.book.tree;

import com.sun.source.tree.Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeItrative {

  TreeNode root;

  public void insert(int data) {
    TreeNode newNode = new TreeNode(data);
    if (root == null) {
      root = newNode;
      return;
    }
    TreeNode temp = root;
    while (true) {
      if (newNode.getData() == temp.getData()) {
        return;
      }

      if (newNode.getData() < temp.getData()) {
        if (temp.getLeft() == null) {
          temp.setLeft(newNode);
          return;
        }
        temp = temp.getLeft();
      } else {
        if (temp.getRight() == null) {
          temp.setRight(newNode);
          return;
        }
        temp = temp.getRight();
      }
    }
  }

  public void bfs() {
    TreeNode printer = root;
    Queue<TreeNode> treeNodeQueue = new LinkedList<>();
    treeNodeQueue.add(printer);
    while (!treeNodeQueue.isEmpty()) {
      printer = treeNodeQueue.remove();
      System.out.print(printer.getData() + " ");
      if (printer.getLeft() != null) {
        treeNodeQueue.add(printer.getLeft());
      }
      if (printer.getRight() != null) {
        treeNodeQueue.add(printer.getRight());
      }
    }
  }

  public void preOrder() {
    TreeNode printer = root;
    Stack<TreeNode> treeStack = new Stack<>();
    treeStack.push(printer);
    while (!treeStack.isEmpty()) {
      printer = treeStack.pop();
      System.out.print(printer.getData() + " ");
      if (printer.getRight() != null) {
        treeStack.push(printer.getRight());
      }
      if (printer.getLeft() != null) {
        treeStack.push(printer.getLeft());
      }
    }
  }

  public void rPreOrder() {
    preOrder(root);
  }

  public void preOrder(TreeNode root) {
    if (root != null) {
      System.out.print(root.getData() + " ");
      preOrder(root.getLeft());
      preOrder(root.getRight());

    }
  }

  public void inOrder() {
    Stack<TreeNode> treeNodeStack = new Stack<>();
    TreeNode currentNode = root;
    while (currentNode != null || !treeNodeStack.isEmpty()) {
      while (currentNode != null) {
        treeNodeStack.push(currentNode);
        currentNode = currentNode.getLeft();
      }
      //current must be null at this point.
      currentNode = treeNodeStack.pop();
      System.out.print(currentNode.getData() + " ");
      currentNode = currentNode.getRight();
    }
  }

  public void rInorder() {
    inOrder(root);
  }

  private void inOrder(TreeNode root) {
    if (root != null) {
      inOrder(root.getLeft());
      System.out.print(root.getData() + " ");
      inOrder(root.getRight());
    }
  }


  public int size() {
    return size(root);
  }

  private int size(TreeNode root) {
    int leftCount = root.getLeft() == null ? 0 : size(root.getLeft());
    int rightCount = root.getRight() == null ? 0 : size(root.getRight());
    return leftCount + rightCount + 1;
  }

  protected int getSize() {
    Stack<TreeNode> stackTrace = new Stack<>();
    TreeNode iterator = root;
    int size = 0;
    if (iterator == null) {
      return 0;
    }
    stackTrace.push(iterator);
    while (!stackTrace.isEmpty()) {
      iterator = stackTrace.pop();
      size++;
      if (iterator.getLeft() != null) {
        stackTrace.push(iterator.getLeft());
      }
      if (iterator.getRight() != null) {
        stackTrace.push(iterator.getRight());
      }
    }
    return size;
  }


}
