package com.janita.food.service;

import com.janita.api.service.IFoodOutService;
import org.springframework.stereotype.Service;

/**
 * Created by Janita on 2017-05-27 10:33
 */
@Service("foodOutService")
public class FoodOutServiceImpl implements IFoodOutService {


    @Override
    public void produceFoodOut() {
        System.out.println("******* 出口食物");
    }
}
