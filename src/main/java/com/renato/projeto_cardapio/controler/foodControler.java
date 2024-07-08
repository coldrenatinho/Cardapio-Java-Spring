package com.renato.projeto_cardapio.controler;

import com.renato.projeto_cardapio.food.food;
import com.renato.projeto_cardapio.food.foodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v2/food")
public class foodControler {

    @Autowired
    private foodRepository foodRepository;

    @GetMapping
    public List<food> getall(){

    List<food> foodList = foodRepository.findAll();
    return foodList;
    }
}
