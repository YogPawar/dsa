package com.java.lambda.student;

import java.util.List;
import java.util.function.Consumer;

public class StudentService {

  // this will print the all student list
  private static final Consumer<Student> printAllStudent = System.out::println;
  private static final Consumer<Student> printActivities =
      (student -> System.out.println(student.getName() + " : " + student.getActivities()));
  private final Consumer<Student> names = student -> System.out.println(student.getName());
  private final Consumer<Student> activites =
      student -> System.out.println(student.getActivities());

  List<Student> allStudents = StudentDataBase.getAllStudents();

  public void printAll() {
    allStudents.forEach(printAllStudent);
  }

  public void printActivites() {
    allStudents.forEach(printActivities);
  }

  public void consumerChain() {
    allStudents.forEach(names.andThen(activites));
  }

  public void printNameAndActivitesOnConditional() {
    allStudents.forEach(
        (student -> {
          if (student.getGpa() >= 4) {
            names.andThen(activites).andThen(printAllStudent).accept(student);
          }
        }));
  }
}
