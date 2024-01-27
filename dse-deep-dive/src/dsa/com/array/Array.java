package dsa.com.array;

public class Array {

  public static void main(String[] args) {
    int[] firstArray = new int[7];
    firstArray[0] = 20;
    firstArray[1] = 5;
    firstArray[2] = -15;
    firstArray[3] = 7;
    firstArray[4] = 55;
    firstArray[5] = 1;
    firstArray[6] = -22;

    for (int i : firstArray) {
      System.out.println(i);
    }

  }
}
