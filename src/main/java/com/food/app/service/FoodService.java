package com.food.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.food.app.model.FoodModel;
import com.food.app.repository.FoodRepository;

@Service
public class FoodService {
	
	@Autowired
	private FoodRepository foodRepo;
	
	// Add operation
	public String addFood(FoodModel food) {
		if(foodRepo.save(food) != 	null) {
			return "food was added";
		} else {
			return "there was an error";
		}
	}
	
	// Get all operation
	public List<FoodModel> getAllFood() {
		List<FoodModel> foods = new ArrayList<>();
		foodRepo.findAll().forEach(foods::add);
		return foods;
	}
	
	// Get single operation
	public Optional<FoodModel> getFood(Long foodId) {
		return foodRepo.findById(foodId);
	}
	
	// Update operation
	public String updateFood(Long foodId, FoodModel food) {
		if(foodRepo.save(food) != null) {
			return "food detail was updated";
		} else {
			return "there was an error";
		}
	}
	
	// Delete single operation
	public String deleteFood(Long foodId) {
		foodRepo.deleteById(foodId);
		return "food was deleted";
	}
	
}
