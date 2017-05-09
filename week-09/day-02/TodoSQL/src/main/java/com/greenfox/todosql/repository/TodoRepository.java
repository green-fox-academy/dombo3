package com.greenfox.todosql.repository;

import com.greenfox.todosql.model.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, Long>{

}
