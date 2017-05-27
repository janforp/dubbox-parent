package com.janita.consumer.controller;

import com.janita.api.service.IFoodOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017-05-27 10:50
 */
@RestController
@RequestMapping("/out")
public class FoodOutController {

    @Autowired
    private IFoodOutService foodOutService;

    @GetMapping
    public void test() {
        foodOutService.produceFoodOut();
    }
}
