package com.janita.food.dao;

import com.janita.api.entity.FoodBean;

public interface FoodDao {
	
	FoodBean getFood(String address);

	FoodBean updateFood();
}
