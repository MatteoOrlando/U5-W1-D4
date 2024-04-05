package matteoorlando.U5D4.services;



import matteoorlando.U5D4.dao.PizzaDAO;
import matteoorlando.U5D4.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaDAO pizzaDAO;

    public List<Pizza> getAllPizzas() {
        return pizzaDAO.getAllPizzas();
    }

    public Pizza getPizzaById(Long id) {
        return pizzaDAO.getPizzaById(id);
    }

    public void savePizza(Pizza pizza) {
        pizzaDAO.savePizza(pizza);
    }

    public void deletePizza(Long id) {
        pizzaDAO.deletePizza(id);
    }
}