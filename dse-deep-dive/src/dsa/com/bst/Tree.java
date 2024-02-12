package dsa.com.bst;

public class Tree {

  private TreeNode root;

  public void insert(int value) {
    if (root == null) {
      root = new TreeNode(value);
    } else {
      root.insert(value);
    }
  }

  public void traverseInOrder() {
    if (root != null) {
      root.traverseInOrder();
    }
  }

  public TreeNode get(int value) {
    if (root == null) {
      return null;
    } else {
      return root.get(value);
    }
  }

  public int min() {
    return (root == null) ? Integer.MIN_VALUE : root.min();
  }

  public int max() {
    return (root == null) ? Integer.MAX_VALUE : root.max();
  }

  public TreeNode delete(int value){
    return root.delete(root, value);
  }
}
