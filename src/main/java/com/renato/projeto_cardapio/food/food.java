package com.renato.projeto_cardapio.food;

import jakarta.persistence.*;

@Table(name = "food")
@Entity(name = "food")
public class food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String image;
    private double price;
}
