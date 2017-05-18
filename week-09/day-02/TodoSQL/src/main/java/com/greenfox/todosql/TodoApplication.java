package com.greenfox.todosql;

import com.greenfox.todosql.model.Todo;
import com.greenfox.todosql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	@Autowired
	TodoRepository todoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
