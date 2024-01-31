package dsa.com.list.doublylinkedlist;

import java.util.HashSet;
import java.util.Set;

public class Main {

  public static void main(String[] args) {
    EmployeeDoublyLinkedList employees = new EmployeeDoublyLinkedList();
    Employee employee = new Employee("Yogesh", "Pawar", 1);
    Employee employee1 = new Employee("Riyansh", "Pawar", 2);
    Employee employee2 = new Employee("Raj", "Kundra", 3);

    employees.addToFront(employee);
    employees.addToFront(employee1);
    employees.addToFront(employee2);

    employees.printList();

    employees.addToEnd(new Employee("Dumita", "Dane", 564));
    System.out.println(employees.getTail());

    Set<Integer> checkDupSet = new HashSet<>();
    checkDupSet.add(2);
  }

}
