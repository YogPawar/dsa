package com.book.tree;

public class BinaryTreeRunner {

  public static void main(String[] args) {
    BinaryTreeRecursion treeNode = new BinaryTreeRecursion();
    treeNode.insert(10);
    treeNode.insert(9);
    treeNode.insert(11);
    treeNode.insert(7);
    treeNode.insert(12);
    treeNode.insert(5);
    treeNode.insert(44);

    System.out.println("Pre Order traversal");
    treeNode.preOrder(treeNode.root);
    System.out.println("\nIn order traversal");
    treeNode.inOrder(treeNode.root);
    System.out.println("\nPost order traversal");
    treeNode.postOrder(treeNode.root);


  }

}
