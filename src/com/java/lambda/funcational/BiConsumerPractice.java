package com.java.lambda.funcational;

import com.java.lambda.student.Student;
import com.java.lambda.student.StudentDataBase;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPractice {

  public static void biConsumer() {
    BiConsumer<String, String> print = (a, b) -> System.out.println(a + " " + b);
    print.accept("Riyansh", "Pawar");
    BiConsumer<Integer, Integer> multiplication =
        (a, b) -> System.out.println("Multiplication is : " + a * b);

    multiplication.accept(3, 4);

    BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division is : " + a / b);
    division.andThen(multiplication).accept(10, 2); // accept(10,2);
  }

  public static void main(String[] args) {
   // biConsumer();
    printStudent();
  }

  private static void printStudent() {
    List<Student> allStudent = StudentDataBase.getAllStudents();
    BiConsumer<String, List<String>> student =
        (name, activites) -> {
          System.out.println(name + " :  " + activites);
        };

    allStudent.forEach(student1 -> student.accept(student1.getName(), student1.getActivities()));
  }
}
