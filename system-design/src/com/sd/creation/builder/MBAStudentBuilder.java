package com.sd.creation.builder;

import java.util.Arrays;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

  @Override
  public StudentBuilder setSubjects() {
    this.subjects = Arrays.asList("Finance", "Management", "Principle Management", "Accounting",
        "HR");
    return this;
  }
}
