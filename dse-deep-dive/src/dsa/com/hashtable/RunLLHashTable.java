package dsa.com.hashtable;

public class RunLLHashTable {

  public static void main(String[] args) {
    LLHashTable hashtable = new LLHashTable();
    Employee employee = new Employee("Yogesh", "Pawar", 1);
    Employee employee2 = new Employee("KK", "Kundra", 3);
    Employee employee3 = new Employee("KR", "Kundra", 3);

    hashtable.put(employee.getFirstName(), employee);
    //  hashtable.put(employee1.getFirstName(), employee1);
    hashtable.put(employee2.getFirstName(), employee2);
    hashtable.put(employee3.getFirstName(), employee3);

    hashtable.printHashTable();
    hashtable.remove("KR");
    hashtable.printHashTable();
  }

}
