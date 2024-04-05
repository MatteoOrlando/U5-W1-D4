package matteoorlando.U5D4.repositories;



import  matteoorlando.U5D4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

}
