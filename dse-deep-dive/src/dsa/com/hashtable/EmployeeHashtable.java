package dsa.com.hashtable;

public class EmployeeHashtable {

  StoredEmployee[] hashtable;

  public EmployeeHashtable(int capacity) {
    hashtable = new StoredEmployee[capacity];
  }

  public void put(String key, Employee employee) {
    int hashedKey = hashKey(key);
    if (occupied(hashedKey)) {
      int stopIndex = hashedKey;
      if (hashedKey == hashtable.length - 1) {
        hashedKey = 0;
      } else {
        hashedKey++;
      }

      while (occupied(hashedKey) && hashedKey != stopIndex) {
        hashedKey = (hashedKey + 1) % hashtable.length;
      }
    }

    if (occupied(hashedKey)) {
      System.out.println("Sorry, there's already an employee at position " + hashedKey);
    } else {
      hashtable[hashedKey] = new StoredEmployee(key, employee);
    }

  }

  public boolean occupied(int index) {
    return hashtable[index] != null;
  }

  private int findKey(String key) {
    int hashedKey = hashKey(key);
    if (hashtable[hashedKey] != null &&
        hashtable[hashedKey].key.equals(key)) {
      return hashedKey;
    }

    int stopIndex = hashedKey;
    if (hashedKey == hashtable.length - 1) {
      hashedKey = 0;
    } else {
      hashedKey++;
    }

    while (hashedKey != stopIndex &&
        hashtable[hashedKey] != null &&
        !hashtable[hashedKey].key.equals(key)) {
      hashedKey = (hashedKey + 1) % hashtable.length;
    }

    if (stopIndex == hashedKey) {
      return -1;
    } else {
      return hashedKey;
    }

  }


  public Employee get(String key) {
    int hashedKey = findKey(key);
    if (hashedKey == -1) {
      return null;
    }
    return hashtable[hashedKey].employee;
  }

  public void printHashtable() {
    for (int i = 0; i < hashtable.length; i++) {
      if (hashtable[i] == null) {
        System.out.println("empty");
      } else {
        System.out.println("Position " + i + ": " + hashtable[i].employee);
      }
    }
  }

  private int hashKey(String key) {
    return key.length() / hashtable.length;
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

  public Employee remove(String key) {
    int hashKey = findKey(key);
    if (hashKey == -1) {
      return null;
    }
    Employee employee = hashtable[hashKey].employee;
    hashtable[hashKey] = null;
    //Rehash the value
    StoredEmployee[] oldHashTable = hashtable;
    for (int i = 0; i < hashtable.length; i++) {
      if (oldHashTable[i] != null) {
        put(oldHashTable[i].key, oldHashTable[i].employee);
      }
    }
    return employee;
  }
}
