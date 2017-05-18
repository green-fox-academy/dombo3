package com.greenfox.todosql.model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String username;
  private String password;

  @OneToMany(mappedBy = "account")
  public Set<Todo> todos;

  public Account(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public Account() {
  }

}
