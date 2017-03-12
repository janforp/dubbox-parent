package com.janita.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.janita.api.entity.FoodBean;
import com.janita.api.service.IFoodService;

@RestController
@RequestMapping("/food")
public class FoodController {

	@Autowired
	private	IFoodService foodService;
	
	@GetMapping("/address")
	public FoodBean getFood(String address){
		return foodService.getFoodByAddress(address);
	}
	
	@GetMapping("/put")
	public FoodBean update(){
		return foodService.updatfeFood();
	}
}
