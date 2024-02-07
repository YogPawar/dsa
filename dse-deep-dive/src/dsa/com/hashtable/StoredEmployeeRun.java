package dsa.com.hashtable;

public class StoredEmployeeRun {

  public static void main(String[] args) {
    Employee employee = new Employee("Yogesh", "Pawar", 1);
    Employee employee2 = new Employee("KK", "Kundra", 3);
    Employee employee3 = new Employee("KR", "Kundra", 3);

    EmployeeHashtable hashtable = new EmployeeHashtable(3);
    hashtable.put("Yogesh", employee);
    hashtable.put("KK", employee2);
    hashtable.put("KR", employee3);

    hashtable.printHashtable();

    System.out.println("Before removing " + hashtable.get("Yogesh"));

    hashtable.remove("Yogesh");
    System.out.println("After removing" + hashtable.get("Yogesh"));
    hashtable.printHashtable();
  }

}
