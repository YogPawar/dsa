package com.misc.bst;

public class BstMain {

  public static void main(String[] args) {
    BinarySearchTree bst = new BinarySearchTree();
    System.out.println(bst.root);

    bst.insert(47);
    bst.insert(21);
    bst.insert(76);
    bst.insert(55);
    bst.insert(65);
    bst.insert(2);
    bst.insert(67);
    bst.insert(89);
    bst.insert(88);
    bst.insert(4);

    System.out.println(bst.contains(444));


  }

}
