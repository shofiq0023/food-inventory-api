package com.food.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FoodModel {
	
	@Id
	private Long id;
	private String name;
	private String price;
	private String description;

	public FoodModel() {
		super();
	}

	public FoodModel(String name, String price, String description) {
		super();
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public FoodModel(long id, String name, String price, String description) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
