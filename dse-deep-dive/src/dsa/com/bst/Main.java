package dsa.com.bst;

public class Main {

  public static void main(String[] args) {
    Tree tree = new Tree();
    tree.insert(65);
    tree.insert(5);
    tree.insert(12);
    tree.insert(78);
    tree.insert(133);
    tree.insert(1);
    tree.insert(10);

    tree.traverseInOrder();

    System.out.println(tree.get(1).data);

    System.out.println("GET MIN : " + tree.min());
    System.out.println("GET MAX : " + tree.max());

  }

}
