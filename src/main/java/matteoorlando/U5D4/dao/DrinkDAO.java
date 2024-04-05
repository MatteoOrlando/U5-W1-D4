package matteoorlando.U5D4.dao;

import matteoorlando.U5D4.entities.Drink;
import matteoorlando.U5D4.repositories.DrinkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DrinkDAO {

    @Autowired
    private DrinkRepository drinkRepository;

    public List<Drink> getAllDrinks() {
        return drinkRepository.findAll();
    }



    // Altri metodi per operazioni CRUD e logica di business specifiche per le bevande
}
