package matteoorlando.U5D4.services;

import matteoorlando.U5D4.dao.DrinkDAO;
import matteoorlando.U5D4.entities.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkService {

    @Autowired
    private DrinkDAO drinkDAO;

    public List<Drink> getAllDrinks() {
        return drinkDAO.getAllDrinks();
    }

    public Drink getDrinkById(Long id) {
        return drinkDAO.getDrinkById(id);
    }

    public void saveDrink(Drink drink) {
        drinkDAO.saveDrink(drink);
    }

    public void deleteDrink(Long id) {
        drinkDAO.deleteDrink(id);
    }
}
