import java.util.Vector;

public class Main {

  public static void printPat(int sum) {
    while (sum > 0) {
      int digit = sum % 10;
      sum /= 10;
      System.out.print(digit);
    }
  }

  public static void main(String[] args) {
    printPat(12345);
  }

}