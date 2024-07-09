package com.renato.projeto_cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "food")
@Entity(name = "food")
@Getter /*Cria com o loombok em runtime todos o métodos de getter*/
@NoArgsConstructor /* Construtor para a classe sem argumentos*/
@AllArgsConstructor /*Cria construtores para as classes*/
@EqualsAndHashCode(of = "id")
public class food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private String image;
    private double price;

    public food(foodRequestDTO data) {
        this.image = data.image();
        this.title = data.title();
        this.price = data.price();
    }

    /*

    public food(Long id, String title, String image, double price) {
        Id = id;
        this.title = title;
        this.image = image;
        this.price = price;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "food{" +
                "Id=" + Id +
                ", title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
    */

}
