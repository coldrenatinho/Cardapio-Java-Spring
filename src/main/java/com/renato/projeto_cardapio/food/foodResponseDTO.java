package com.renato.projeto_cardapio.food;

public record foodResponseDTO(Long id, String title, String image, double price){

    public foodResponseDTO(food food) {
        this(food.getId(), food.getTitle(), food.getImage(), food.getPrice() );
    }
}
