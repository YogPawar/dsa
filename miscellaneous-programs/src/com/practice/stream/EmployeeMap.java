package com.practice.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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
    employees.stream().mapToInt(Employee::getSalary).max().orElse(0);
    return employees.stream().mapToInt(Employee::getSalary).max().orElse(0);//

    // getAsInt();
  }


  public static void main(String[] args) {
    sortEmployeeOnBasisSalary(EmployeeDB.getEemployeeMap());
    secondHeighstSalary(EmployeeDB.getEemployeeMap());
    findEmployeeWithMaxSalary(EmployeeDB.getEemployeeMap());
    convertListToMap(EmployeeDB.getEmployees());

  }

  private static void filterEmployeeMap(Map<Integer, Employee> employeeMap) {
    List<Employee> filteredEmployee = employeeMap.values().stream()
        .filter(employee -> employee.getSalary() > 5000)
        .filter(employee -> employee.getSkills().contains("Java")
        ).collect(Collectors.toList());
    filteredEmployee.forEach(System.out::println);
  }

  public static void sortEmployeeOnBasisSalary(Map<Integer, Employee> employeeMap) {
    List<Employee> sortedEmployee = employeeMap.values().stream()
        .sorted(Comparator.comparingInt(Employee::getSalary))
        .collect(Collectors.toList());
    sortedEmployee.forEach(System.out::println);
  }

  public static void secondHeighstSalary(Map<Integer, Employee> employeeMap) {
    Optional<Integer> secondHeighstSalary = employeeMap.values().stream()
        .map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2)
        .findFirst();
    secondHeighstSalary.ifPresent(salary -> System.out.println("Second Highest Salary" + salary));
  }

  public static void findEmployeeWithMaxSalary(Map<Integer, Employee> employeeMap) {
    Optional<Employee> maxSalary = employeeMap.values().stream()
        .max(Comparator.comparingInt(Employee::getSalary));
    maxSalary.ifPresent(System.out::println);
  }

  public static void convertListToMap(List<Employee> employees) {
    Map<Integer, Employee> employeeMap = employees.stream()
        .collect(Collectors.toMap(Employee::getId, employee -> employee));

    employeeMap.forEach((id, employee) -> System.out.println("ID: " + id + " : Employee "
        + employee));
  }

}
