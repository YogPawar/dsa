package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

  public static List<Employee> getEmployees() {
    return Stream.of(new Employee(1, "Yogesh", 10000, Arrays.asList("Java", "CPP", "MySQL")),
            new Employee(2, "Rajesh", 9000, Arrays.asList("Scrips", "C", "Oracle")),
            new Employee(3, "Laxman", 8000, Arrays.asList("Android", "Java", "HTTP")),
            new Employee(4, "Deepak", 7000, Arrays.asList("Mockito", "Selnium", "Test"))
            , new Employee(5, "Amar", 60000, Arrays.asList("Salesforce", "Android", "MySQL"))

        )
        .collect(
            Collectors.toList());
  }

  public static Map<Integer, Employee> getEemployeeMap() {
    Employee e1 = new Employee(1, "Yogesh", 10000, Arrays.asList("Java", "CPP", "MySQL"));
    Employee e2 = new Employee(2, "Rajesh", 9000, Arrays.asList("Scrips", "C", "Oracle"));
    Employee e3 = new Employee(3, "Laxman", 8000, Arrays.asList("Android", "Java", "HTTP"));
    Employee e4 = new Employee(4, "Deepak", 7000, Arrays.asList("Mockito", "Selnium", "Test"));
    Employee e5 = new Employee(5, "Amar", 6000, Arrays.asList("Salesforce", "Android", "MySQL"));

    Map<Integer, Employee> employeeMap = new HashMap<>();
    employeeMap.put(e1.getId(), e1);
    employeeMap.put(e2.getId(), e2);
    employeeMap.put(e3.getId(), e3);
    employeeMap.put(e4.getId(), e4);
    employeeMap.put(e5.getId(), e5);
    return employeeMap;
  }


}
