package com.renato.projeto_cardapio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api-v2-food")
public class foodControler {

    @GetMapping
    public void getall(){

    }
}
