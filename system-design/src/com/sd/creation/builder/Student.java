package com.sd.creation.builder;

import java.util.List;

/**
 * When we have lots of optional field then its best design patterns. BuilderDesign :
 */
public class Student {

  int rollNumber;
  int age;
  String mobile;
  String firstName;
  String fatherName;
  String motherName;
  String address;
  List<String> subjects;

  public Student(StudentBuilder builder) {
    this.rollNumber = builder.rollNumber;
    this.age = builder.age;
    this.mobile = builder.mobile;
    this.firstName = builder.firstName;
    this.fatherName = builder.fatherName;
    this.motherName = builder.motherName;
    this.address = builder.address;
    this.subjects = builder.subjects;
  }

  @Override
  public String toString() {
    return "Student{" +
        "rollNumber=" + rollNumber +
        ", age=" + age +
        ", mobile='" + mobile + '\'' +
        ", firstName='" + firstName + '\'' +
        ", fatherName='" + fatherName + '\'' +
        ", motherName='" + motherName + '\'' +
        ", address='" + address + '\'' +
        ", subjects=" + subjects +
        '}';
  }
}
