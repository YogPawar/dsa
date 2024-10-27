package com.sd.creation.builder;

public class Director {

  StudentBuilder studentBuilder;

  public Director(StudentBuilder builder) {
    this.studentBuilder = builder;
  }

  public Student createStudent() {
    if (studentBuilder instanceof MCAStudentBuilder) {
      return mcaStudent();
    } else if (studentBuilder instanceof MBAStudentBuilder) {
      return mbaStudent();
    }
    return null;
  }

  private Student mcaStudent() {
    return studentBuilder.setRollNumber(1).setFirstName("Yogesh").setSubjects().build();
  }

  private Student mbaStudent() {
    return studentBuilder.setRollNumber(2).setFirstName("Rajesh").setSubjects().build();
  }

}
