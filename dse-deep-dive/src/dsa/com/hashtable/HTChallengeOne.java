package dsa.com.hashtable;

public class HTChallengeOne {

  public static void main(String[] args) {
    int[] nums = new int[10];
    int[] numsToAdd = {59382, 43, 6894, 500, 99, -58};
    for (int i = 0; i < numsToAdd.length; i++) {
      nums[hash(numsToAdd[i])] = numsToAdd[i];
    }
    for (int i : nums) {
      System.out.println(i);
    }
  }

  private static int hash(int i) {
    return Math.abs(
        i % 10); //modiulous with length of the array so will not get the out of index exception
  }

}
