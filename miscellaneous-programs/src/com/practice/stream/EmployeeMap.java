package com.practice.stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMap {

  private static void filterEmployee(Map<Integer, Employee> employeeMap) {
    List<Employee> filteredEmployee = employeeMap.values().stream()
        .filter(employee -> employee.getSalary() > 7000)
        .filter(employee -> employee.getSkills().contains("Java")).collect(
            Collectors.toList());

    filteredEmployee.forEach(employee -> System.out.println(
        "Employee ID : " + employee.getId() + " Employee Details : " + employee));

  }

  public static int getMaxSalary(List<Employee> employees) {
    return employees.stream().mapToInt(Employee::getSalary).max().orElse(0);//
    // getAsInt();
  }


  public static void main(String[] args) {
    filterEmployee(EmployeeDB.getEemployeeMap());
    System.out.println(getMaxSalary(EmployeeDB.getEmployees()));

    int[] salary = {3444, 5647, 9807, 10345};
    System.out.println(Arrays.stream(salary).max().orElse(0));//getAsInt());
    System.out.println(Arrays.stream(salary).min().orElse(0));//getAsInt());
  }

}
