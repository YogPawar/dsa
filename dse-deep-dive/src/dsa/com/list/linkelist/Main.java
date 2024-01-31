package dsa.com.list.linkelist;

public class Main {

  public static void main(String[] args) {
    EmployeeLinkedList employees = new EmployeeLinkedList();
    Employee employee = new Employee("Yogesh", "Pawar", 1);
    Employee employee1 = new Employee("Riyansh", "Pawar", 2);
    Employee employee2 = new Employee("Raj", "Kundra", 3);

    employees.addToFront(employee);
    employees.addToFront(employee1);
    employees.addToFront(employee2);

    employees.printList();

    System.out.println(employees.getSize());
    System.out.println(employees.isEmpty());

    employees.removeFront();

    employees.printList();

  }

}
