package com.misc.recursion;

import com.misc.bst.BinarySearchTree;

public class RecusrsivSearchBST {

  public static void main(String[] args) {
    BinarySearchTree myBst = new BinarySearchTree();
    myBst.rInsert(45);
    myBst.rInsert(67);
    myBst.rInsert(54);
    myBst.rInsert(1);
    myBst.rInsert(5);
    boolean isContain = myBst.rContains(5);
    System.out.println(isContain);
    System.out.println(myBst.rContains(0));

    System.out.println(myBst.minValue(myBst.root));
    System.out.println(myBst.minValue(myBst.root.right));

    System.out.println(myBst.rDelete(1).value);
    System.out.println(myBst.rContains(1));


  }

}
