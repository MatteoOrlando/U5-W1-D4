package matteoorlando.U5D4.repositories;

import matteoorlando.U5D4.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepository extends JpaRepository<Topping, Long> {

}
