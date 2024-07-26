import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

  private static void towerOfHanoi(int plates, char source, char destination, char auxilary) {
    //base case
    if (plates == 0) {
      return;
    }
    //shift the plate from source to destination with the help of auxilary pliiter
    towerOfHanoi(plates - 1, source, auxilary, destination);
    System.out.println(
        "Moved disk [" + plates + "]  from : " + source + " to : " + destination);
    //shift the plates from auxilary  to destination
    towerOfHanoi(plates - 1, auxilary, destination, source);
  }

  public static void main(String[] args) {
    towerOfHanoi(3, 'A', 'B', 'C');

  }
}