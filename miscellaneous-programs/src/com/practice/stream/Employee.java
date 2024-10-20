package com.practice.stream;

import java.util.List;

public class Employee {

  int id;
  String name;
  int salary;
  List<String> skills;

  public Employee() {
  }

  public Employee(int id, String name, int salary, List<String> skills) {
    this.id = id;
    this.name = name;
    this.skills = skills;
    this.salary = salary;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public List<String> getSkills() {
    return skills;
  }

  public void setSkills(List<String> skills) {
    this.skills = skills;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", salary=" + salary +
        ", skills=" + skills +
        '}';
  }
}
