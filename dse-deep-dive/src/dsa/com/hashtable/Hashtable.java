package dsa.com.hashtable;

public class Hashtable {

  Employee[] hashtable;

  public Hashtable(int capacity) {
    hashtable = new Employee[capacity];
  }

  public void put(String key, Employee value) {
    int hashkey = hashKey(key);
    if (occupied(hashkey
    )) {
      hashkey = tryKey(hashkey);
    }
    if (occupied(hashkey)) {
      System.out.println("Sorry there's element present at index :" + hashkey);
    } else {
      hashtable[hashkey] = value;
    }

  }

  public boolean occupied(int index) {
    return hashtable[index] != null;
  }

  public int tryKey(int index) {
    if (occupied(index)) {
      int stopIndex = index;
      if (index == hashtable.length - 1) {
        index = 0;
      } else {
        index++;
      }

      while (occupied(index) && index != stopIndex) {
        index = (index + 1) / hashtable.length;
      }
    }
    return index;
  }

  public Employee get(String key) {
    int hashKey = hashKey(key);
    return hashtable[hashKey];
  }

  public void printHashTable() {
    for (Employee emp : hashtable) {
      System.out.println(emp);
    }
  }

  private int hashKey(String key) {
    return key.length() / hashtable.length;
  }
}
