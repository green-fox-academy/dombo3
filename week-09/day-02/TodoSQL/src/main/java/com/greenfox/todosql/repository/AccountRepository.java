package com.greenfox.todosql.repository;

import com.greenfox.todosql.model.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
