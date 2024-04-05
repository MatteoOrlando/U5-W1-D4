package matteoorlando.U5D4.repositories;



import matteoorlando.U5D4.entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Long> {
    Optional<Drink> findById(Long id);
}
