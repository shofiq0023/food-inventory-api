package com.food.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.food.app.model.FoodModel;
import com.food.app.service.FoodService;

@RestController
public class FoodController {
	
	@Autowired
	private FoodService foodService;
	
	// Add food item
	@RequestMapping(value = "/food/add", method = RequestMethod.POST)
	public String addFood(@RequestBody FoodModel food) {
		return foodService.addFood(food);
	}
	
	// Get all food item
	@RequestMapping("/food/getAll")
	public List<FoodModel> getAllFood() {
		return foodService.getAllFood();
	}
	
	// Get single food item
	@RequestMapping("/food/{foodId}")
	public Optional<FoodModel> getFood(@PathVariable Long foodId) {
		return foodService.getFood(foodId);
	}
	
	// Update food item
	@RequestMapping(value = "/food/update/{foodId}", method = RequestMethod.PUT)
	public String updateFood(@PathVariable Long foodId, @RequestBody FoodModel food) {
		return foodService.updateFood(foodId, food);
	}
	
	// Delete a food item
	@RequestMapping(value = "/food/delete/{foodId}", method = RequestMethod.DELETE)
	public String deleteFood(@PathVariable Long foodId) {
		return foodService.deleteFood(foodId);
	}

}
