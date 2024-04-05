package matteoorlando.U5D4.dao;


import matteoorlando.U5D4.entities.Pizza;
import matteoorlando.U5D4.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaDAO {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizzas() {
        return pizzaRepository.findAll();
    }

    // Altri metodi per operazioni CRUD e logica di business specifiche per le pizze
}
