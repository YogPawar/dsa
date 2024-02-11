package dsa.com.search;

public class SearchMain {

  public static void main(String[] args) {
    int[] input = {10, 20, 25, 45, 55, 60, 66, 110};
    BinerarySearch binerarySearch = new BinerarySearch();
    System.out.println(binerarySearch.search(input, 110));
    System.out.println(binerarySearch.recursiveBineraySearch(input, 110));
  }

}
