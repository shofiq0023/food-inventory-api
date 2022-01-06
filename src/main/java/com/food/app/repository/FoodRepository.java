package com.food.app.repository;

import org.springframework.data.repository.CrudRepository;

import com.food.app.model.FoodModel;

public interface FoodRepository extends CrudRepository<FoodModel, Long> {

}
