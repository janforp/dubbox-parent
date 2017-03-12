package com.janita.food.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.janita.api.entity.FoodBean;
import com.janita.api.service.IFoodService;
import com.janita.food.dao.FoodDao;

@Service("foodService")
public class FoodServiceImpl implements IFoodService{
	
	@Autowired
	private	FoodDao foodDao;
	
	@Override
	public FoodBean getFoodByAddress(String address) {
		return foodDao.getFood(address);
	}

	@Override
	public FoodBean updateFood() {
		
		return foodDao.updateFood();
	}
	

}
