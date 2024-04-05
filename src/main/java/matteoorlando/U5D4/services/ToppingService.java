package matteoorlando.U5D4.services;

import matteoorlando.U5D4.dao.ToppingDAO;
import matteoorlando.U5D4.entities.Topping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToppingService {

    @Autowired
    private ToppingDAO toppingDAO;

    public List<Topping> getAllToppings() {
        return toppingDAO.getAllToppings();
    }

    public Topping getToppingById(Long id) {
        return toppingDAO.getToppingById(id);
    }

    public void saveTopping(Topping topping) {
        toppingDAO.saveTopping(topping);
    }

    public void deleteTopping(Long id) {
        toppingDAO.deleteTopping(id);
    }
}
