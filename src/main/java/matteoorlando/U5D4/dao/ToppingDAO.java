package matteoorlando.U5D4.dao;

import matteoorlando.U5D4.entities.Topping;
import matteoorlando.U5D4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToppingDAO {

    @Autowired
    private ToppingRepository toppingRepository;

    public List<Topping> getAllToppings() {
        return toppingRepository.findAll();
    }

    // Altri metodi per operazioni CRUD e logica di business specifiche per i toppings
}
