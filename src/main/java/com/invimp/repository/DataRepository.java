package com.invimp.repository;

import com.invimp.model.Data;

import javax.enterprise.context.ApplicationScoped;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class DataRepository {
  public List<Data> getData() {
    return Arrays.asList(
        new Data("012xa2", "Importance Idea"),
        new Data("a213xaa", "Secret Innovation"),
        new Data("a223xaa", "Trouble Innovation"));
  }
}
