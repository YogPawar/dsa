package com.dsa.eassy.binary;

import com.dsa.eassy.binary.BinaryTree.Node;

public class InvertTree {

  public static BinaryTree.Node invertTree(BinaryTree.Node root) {
    if (root == null) {
      return null;
    }

    BinaryTree.Node temp = root.left;
    root.left = root.right;
    root.right = temp;

    invertTree(root.left);
    invertTree(root.right);
    return root;
  }

  public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();
  tree.insert(5);
  tree.insert(2);
  tree.insert(4);
  tree.insert(7);
  tree.insert(9);


    tree.inOrder(invertTree(tree.root));
  }

}
