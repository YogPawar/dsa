package com.book.tree;

public class BinaryTreeRunner {

  public static void main(String[] args) {
    BinaryTreeItrative treeNode = new BinaryTreeItrative();
    treeNode.insert(10);
    treeNode.insert(5);
    treeNode.insert(11);
    treeNode.insert(4);
    treeNode.insert(6);
    treeNode.insert(9);
    treeNode.insert(12);
    treeNode.insert(2);
    treeNode.insert(3);

    System.out.println("Size by Recursion :" + treeNode.size());
    System.out.println("Size by Iterative :" + treeNode.getSize());

  }

}
