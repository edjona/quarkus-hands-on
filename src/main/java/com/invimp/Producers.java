package com.invimp;

import io.quarkus.arc.DefaultBean;
import io.quarkus.arc.profile.IfBuildProfile;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import java.util.ArrayList;
import java.util.List;

@Dependent
public class Producers {
  @Produces
  @IfBuildProfile("prod")
  List<Student> superHeroes() {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Tony", "Stark"));
    students.add(new Student("Bruce", "Wayne"));
    return students;
  }

  @Produces
  @DefaultBean
  List<Student> normalPerson() {
    List<Student> students = new ArrayList<>();
    students.add(new Student("Tony", "Hawk"));
    students.add(new Student("Christiano", "Ronaldo"));
    return students;
  }

}
