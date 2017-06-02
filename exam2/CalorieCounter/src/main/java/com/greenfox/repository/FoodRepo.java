package com.greenfox.repository;

import com.greenfox.model.Food;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepo extends CrudRepository<Food, Long> {
}
