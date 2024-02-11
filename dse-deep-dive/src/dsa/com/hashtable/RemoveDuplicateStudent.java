package dsa.com.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RemoveDuplicateStudent {

  public static void main(String[] args) {

    Student s1 = new Student(1, "Riyansh", "Pawar");
    Student s2 = new Student(1, "Riyansh", "Pawar");
    Student s3 = new Student(2, "Shreyansh", "Pawar");
    Student s4 = new Student(2, "Shreyansh", "Pawar");
    Student s5 = new Student(3, "Netra", "Pawar");
    Student s6 = new Student(3, "Netra", "Pawar");
    Student s7 = new Student(4, "Rudra", "Pawar");
    Student s8 = new Student(4, "Rudra", "Pawar");
    Student s9 = new Student(5, "Yash", "Pawar");

    List<Student> students = new ArrayList<>();
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    students.add(s5);
    students.add(s6);
    students.add(s7);
    students.add(s8);
    students.add(s9);

    students.forEach(System.out::print);
    List<Student> duplicate = new ArrayList<>();
    HashMap<Integer, Student> studentHashMap = new HashMap<>();
    students.forEach(student -> {
      if (studentHashMap.containsKey(student.getId())) {
        duplicate.add(student);
      } else {
        studentHashMap.put(student.getId(), student);
      }
    });

    duplicate.forEach(dupStud -> {
      students.remove(dupStud);
    });

    System.out.println();
    students.forEach(System.out::print);

  }

}
