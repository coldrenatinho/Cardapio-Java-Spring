package com.renato.projeto_cardapio.controler;

import com.renato.projeto_cardapio.food.food;
import com.renato.projeto_cardapio.food.foodRequestDTO;
import com.renato.projeto_cardapio.food.foodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/v2/food")
public class foodControler {

    @Autowired
    private  com.renato.projeto_cardapio.food.foodRepository foodRepository;

    @GetMapping
    public List<foodResponseDTO> getall(){
    List<foodResponseDTO> foodlist = foodRepository.findAll().stream().map(foodResponseDTO::new).toList();
    return foodlist;
    }

    @PostMapping
    public void saveFood(@RequestBody foodRequestDTO data){
        food foodData = new food(data);
        foodRepository.save(data);
    }

}
