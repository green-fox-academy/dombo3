package com.greenfox.todosql.repository;

import com.greenfox.todosql.model.Todo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  public List<Todo> findAllByisDoneTrue();
}
