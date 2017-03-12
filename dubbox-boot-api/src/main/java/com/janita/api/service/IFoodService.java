package com.janita.api.service;

import com.janita.api.entity.FoodBean;

public interface IFoodService {
	
	FoodBean getFoodByAddress(String address);

	FoodBean updateFood();
}
