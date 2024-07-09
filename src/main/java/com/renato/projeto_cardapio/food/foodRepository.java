package com.renato.projeto_cardapio.food;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import com.renato.projeto_cardapio.food.food;


public interface foodRepository extends JpaRepository<food, Long> {

}
