package com.misc.bst;

public class BstMain {

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();

    bst.insert(10);
    bst.insert(9);
    bst.insert(11);
    bst.insert(7);
    bst.insert(12);
    bst.insert(5);
    bst.insert(44);

    System.out.println("BFS" + bst.BFS());
    System.out.println("DFS-PreOrder" + bst.DFSPreOrder());
    System.out.println("DFS-PostOrder" + bst.DFSPostOrder());
    System.out.println("DFS-InOrder" + bst.DFSInorder());


  }

}
