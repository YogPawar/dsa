package com.sd.creation.builder;

import java.util.List;

public abstract class StudentBuilder {

  int rollNumber;
  int age;
  String mobile;
  String firstName;
  String fatherName;
  String motherName;
  String address;
  List<String> subjects;

  public StudentBuilder setRollNumber(int rollNumber) {
    this.rollNumber = rollNumber;
    return this;
  }

  public StudentBuilder setAge(int age) {
    this.age = age;
    return this;
  }

  public StudentBuilder setMobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

  public StudentBuilder setAddress(String address) {
    this.address = address;
    return this;
  }

  public StudentBuilder setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public StudentBuilder setMotherName(String motherName) {
    this.motherName = motherName;
    return this;
  }

  public StudentBuilder setFatherName(String fatherName) {
    this.fatherName = fatherName;
    return this;

  }

  abstract public StudentBuilder setSubjects();

  public Student build() {
    return new Student(this);
  }
}
