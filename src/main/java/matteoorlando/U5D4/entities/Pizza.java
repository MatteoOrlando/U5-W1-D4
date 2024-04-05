package matteoorlando.U5D4.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private double prezzoBase;

    @Setter
    @Getter
    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL)
    private List<Topping> toppings;

    public Pizza(String margherita, double v) {
    }


}