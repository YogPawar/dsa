import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<String> test = new ArrayList<>();
    test.add("A");
    test.add("B");
    test.add("C");
    Iterator<String> itr = test.listIterator();
    itr.next();
    itr.remove();
    itr.next();
    itr.remove();

    System.out.println(test);
  }
}