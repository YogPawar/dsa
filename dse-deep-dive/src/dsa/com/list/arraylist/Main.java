package dsa.com.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    Employee employee = new Employee("Yogehs", "Pawar", 1);
    Employee employee1 = new Employee("Riyansh", "Pawar", 2);
    Employee employee2 = new Employee("Raj", "Kundra", 3);

    employees.add(employee);
    employees.add(employee1);
    employees.add(employee2);

    // employees.forEach(employee3 -> System.out.println(employee3));

    //  System.out.println(employees.get(1));

    //Get the employee as array
    Employee[] employees1 = employees.toArray(new Employee[employees.size()]);
    for (Employee em : employees1) {
      System.out.println(em);
    }
  }

}
