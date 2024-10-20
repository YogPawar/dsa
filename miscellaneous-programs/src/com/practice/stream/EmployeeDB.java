package com.practice.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

  public static List<Employee> getEmployees() {
    return Stream.of(new Employee(1, "Yogesh", 10000, Arrays.asList("Java", "CPP", "MySQL")),
            new Employee(2, "Rajesh", 9000, Arrays.asList("Scrips", "C", "Oracle")),
            new Employee(3, "Laxman", 8000, Arrays.asList("Android", "Java", "HTTP")),
            new Employee(4, "Deepak", 7000, Arrays.asList("Mockito", "Selnium", "Test"))
            , new Employee(5, "Amar", 6000, Arrays.asList("Salesforce", "Android", "MySQL"))

        )
        .collect(
            Collectors.toList());
  }


}
