import java.util.Vector;

public class Main {

  public static void printPat(int sum) {
    while (sum > 0) {
      int digit = sum % 10;
      sum /= 10;

      if (sum < 0) {
        digit = digit * -1;
      }


    }
  }

  public static void main(String[] args) {
    System.out.println();
  }

}