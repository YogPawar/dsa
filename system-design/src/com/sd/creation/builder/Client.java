package com.sd.creation.builder;

public class Client {

  public static void main(String[] args) {
    Director mca = new Director(new MCAStudentBuilder());
    Director mba = new Director(new MBAStudentBuilder());
    Student mcaStudent = mca.createStudent();
    Student mbaStudent = mba.createStudent();

    System.out.println(mcaStudent);
    System.out.println(mbaStudent);
  }


}
