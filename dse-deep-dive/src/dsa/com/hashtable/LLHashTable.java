package dsa.com.hashtable;

import java.util.LinkedList;
import java.util.ListIterator;

public class LLHashTable {

  private LinkedList<StoredEmployee>[] hashtable;

  public LLHashTable() {
    hashtable = new LinkedList[10];
    for (int i = 0; i < hashtable.length; i++) {
      hashtable[i] = new LinkedList<>();
    }
  }

  public void put(String key, Employee employee) {
    int hashKey = hashKey(key);
    hashtable[hashKey].add(new StoredEmployee(key, employee));
  }

  public Employee get(String key) {
    int hasKey = hashKey(key);
    ListIterator<StoredEmployee> iterator = hashtable[hasKey].listIterator();
    StoredEmployee employee = null;
    while (iterator.hasNext()) {
      employee = iterator.next();
      if (employee.key.equals(key)) {
        return employee.employee;
      }
    }
    return null;
  }

  public Employee remove(String key) {
    int hasKey = hashKey(key);
    ListIterator<StoredEmployee> iterator = hashtable[hasKey].listIterator();
    StoredEmployee employee = null;
    int index = -1;
    while (iterator.hasNext()) {
      employee = iterator.next();
      index++;
      if (employee.key.equals(key)) {
        break;
      }
    }
    if (employee == null || !employee.key.equals(key)) {
      return null;
    } else {
      hashtable[hasKey].remove(index); //passing here index to avoid the reiteration of list
      return employee.employee;
    }
  }

  private int hashKey(String key) {
    return Math.abs(key.hashCode()) % hashtable.length;
  }

  public void printHashTable() {
    for (int i = 0; i < hashtable.length; i++) {
      if (hashtable[i].isEmpty()) {
        System.out.println("Position : " + i + " is empty");
      } else {
        System.out.print("Position : " + i + " : ");
        ListIterator<StoredEmployee> iterator = hashtable[i].listIterator();
        while (iterator.hasNext()) {
          System.out.print(iterator.next().employee);
          System.out.println("->");
        }
        System.out.println("null");

      }
    }
  }
}
