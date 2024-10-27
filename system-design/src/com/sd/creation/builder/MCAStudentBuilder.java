package com.sd.creation.builder;

import java.util.Arrays;

public class MCAStudentBuilder extends StudentBuilder {

  @Override
  public StudentBuilder setSubjects() {
    this.subjects = Arrays.asList("C", "C++", "Java", "PLSQL");
    return this;
  }
}
