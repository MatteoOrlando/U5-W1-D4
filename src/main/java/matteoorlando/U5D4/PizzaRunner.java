package matteoorlando.U5D4;

import matteoorlando.U5D4.entities.Pizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PizzaRunner implements CommandLineRunner {

    @Autowired
    private PizzaService pizzaService;

    @Override
    public void run(String... args) throws Exception {
        // Creazione di una nuova pizza
        Pizza newPizza = new Pizza("Margherita", 5.0);
        pizzaService.savePizza(newPizza);

        // Stampa di tutte le pizze
        System.out.println("Pizze disponibili:");
        List<Pizza> allPizzas = pizzaService.getAllPizzas();
        allPizzas.forEach(System.out::println);

        // Esempio di altre operazioni di business come il filtraggio, l'aggiornamento, ecc.
        // In base alle operazioni che hai implementato nei servizi.
    }
}