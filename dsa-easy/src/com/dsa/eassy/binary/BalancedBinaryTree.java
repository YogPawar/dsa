package com.dsa.eassy.binary;

import com.dsa.eassy.binary.BinaryTree.Node;

public class BalancedBinaryTree {

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
    tree.insert(5);
    tree.insert(2);
    tree.insert(4);
    System.out.println(isBalanceTree(tree.root));
  }

  private static boolean isBalanceTree(Node root) {
    return height(root, 1) > 1;
  }

  private static int height(Node root, int height) {
    if (root != null) {
      int lh = height(root.left, height + 1);
      int rh = height(root.right, height + 1);
      if (lh < 0 || rh < 0 || Math.abs(lh - rh) > 1) {
        return -1;
      }
      return Math.max(lh, rh);
    }
    return height;
  }


}
