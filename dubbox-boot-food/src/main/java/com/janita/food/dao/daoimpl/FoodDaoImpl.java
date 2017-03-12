package com.janita.food.dao.daoimpl;

import org.springframework.stereotype.Repository;

import com.janita.api.entity.FoodBean;
import com.janita.food.dao.FoodDao;

@Repository
public class FoodDaoImpl implements FoodDao {

	@Override
	public FoodBean getFood(String address) {
		FoodBean food = new FoodBean();
		food.setProduceAddress(address);
		food.setRemark("food remark");
		food.setRiceName("food name");
		return food;
	}

	@Override
	public FoodBean updateFood() {
		FoodBean food = new FoodBean();
		food.setProduceAddress("update");
		food.setRemark("food remark");
		food.setRiceName("food name");
		return food;
	}

}
