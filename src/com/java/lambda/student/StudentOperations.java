package com.java.lambda.student;

import java.util.List;

public class StudentOperations {

  public static void main(String[] args) {
    StudentService service = new StudentService();
   // service.printAll();
   // service.printActivites();
   // service.consumerChain();

    System.out.println("Conditional Printing");

    service.printNameAndActivitesOnConditional();
  }
}
