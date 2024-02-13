package dsa.com.bst;

public class TreeNode {

  public int data;
  public TreeNode leftChild;
  public TreeNode rightChild;

  public TreeNode(int data) {
    this.data = data;
  }

  public void insert(int value) {
    if (data == value) {
      return;
    }
    if (value < data) {
      if (leftChild == null) {
        leftChild = new TreeNode(value);
      } else {
        leftChild.insert(value);
      }
    } else {
      if (rightChild == null) {
        rightChild = new TreeNode(value);
      } else {
        rightChild.insert(value);
      }
    }
  }

  public void traverseInOrder() {
    if (leftChild != null) {
      leftChild.traverseInOrder();
    }
    System.out.print(data + ", ");
    if (rightChild != null) {
      rightChild.traverseInOrder();
    }
  }

  public void traversePreOrder() {
    System.out.print(data + ", ");
    if (leftChild != null) {
      leftChild.traversePreOrder();
    }
    if (rightChild != null) {
      rightChild.traversePreOrder();
    }
  }

  public void traversePostOrder() {
    if (leftChild != null) {
      leftChild.traversePostOrder();
    }
    if (rightChild != null) {
      rightChild.traversePostOrder();
    }
    System.out.print(data + ", ");

  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public TreeNode getLeftChild() {
    return leftChild;
  }

  public void setLeftChild(TreeNode leftChild) {
    this.leftChild = leftChild;
  }

  public TreeNode getRightChild() {
    return rightChild;
  }

  public void setRightChild(TreeNode rightChild) {
    this.rightChild = rightChild;
  }

  public TreeNode get(int value) {
    if (data == value) {
      return this;
    }
    if (value < data) {
      if (leftChild != null) {
        return leftChild.get(value);
      } else {
        if (rightChild != null) {
          return rightChild.get(value);
        }
      }
    }
    return null;
  }

  public int min() {
    if (this.leftChild != null) {
      return leftChild.min();
    }
    return this.data;
  }

  public int max() {
    if (this.rightChild != null) { //if(rightChild == null return data else rightchaild.max()
      return rightChild.max();
    }
    return this.data;
  }

  public TreeNode delete(TreeNode subRoot, int value) {
    if (subRoot == null) {
      return subRoot;
    }

    if (value < subRoot.getData()) {
      subRoot.setLeftChild(delete(subRoot.getLeftChild(), value));
    } else if (value > subRoot.getData()) {
      subRoot.setRightChild(delete(subRoot.getRightChild(), value));
    } else {
      //case 1 -2 :node to delete have 0 to 1 children
      if (subRoot.equals(getLeftChild() == null)) {
        return subRoot.getRightChild();
      } else if (subRoot.getRightChild() == null) {
        return subRoot.getRightChild();
      }

      //case 3 : node to delete have 3 children
      // Replace the value in the  subtree root node with smallest value from the right subtree

      subRoot.setData(subRoot.getRightChild().min());
      //delete the node that has the smallest value in the right subtroot
      subRoot.setRightChild(delete(subRoot.getRightChild(), subRoot.getData()));
    }
    return subRoot;
  }
}
