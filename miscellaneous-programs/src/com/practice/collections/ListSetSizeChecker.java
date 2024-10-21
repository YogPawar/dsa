package com.practice.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetSizeChecker {

  public static void main(String[] args) {
    Student s1 = new Student(1, "Yogesh");
    Student s2 = new Student(1, "Yogesh");

    List<Student> studentList = new ArrayList<>();
    Set<Student> studentSet = new HashSet<>();
    studentList.add(s1);
    studentList.add(s2);
    System.out.println("List Size : " + studentList.size());

    studentSet.add(s1);
    studentSet.add(s2);
    System.out.println("Set Size : " + studentSet.size());
  }

}
