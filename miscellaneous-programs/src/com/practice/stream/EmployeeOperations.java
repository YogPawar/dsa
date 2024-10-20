package com.practice.stream;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOperations {

  private static List<Employee> getOnSalaryAndSkillBase(List<Employee> employees) {
    return employees.stream().filter(employee -> employee.getSalary() > 5000)
        .filter(employee -> employee.getSkills().contains("Java")).collect(
            Collectors.toList());
  }

  public static void main(String[] args) {
    List<Employee> employees = EmployeeDB.getEmployees();

  /*  List<String> employeeName = employees.stream().map(employee -> employee.getName())
        .collect(Collectors.toList());
    System.out.println(employeeName);*/

    List<Employee> filtered = getOnSalaryAndSkillBase(employees);
    filtered.forEach(System.out::println);
  }

}
