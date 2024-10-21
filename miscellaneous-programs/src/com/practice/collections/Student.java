package com.practice.collections;

import java.util.Objects;

public class Student {

  int id;
  String name;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
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

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (!(obj instanceof Student)) {
      return false;
    }

    Student student = (Student) obj;
    return this.id == student.id && this.name.equalsIgnoreCase(student.getName());
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(this.id);
  }
}
