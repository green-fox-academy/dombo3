package com.greenfox.repository;

import com.greenfox.model.Foodtype;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodtypeRepo extends CrudRepository<Foodtype, Long> {
}
