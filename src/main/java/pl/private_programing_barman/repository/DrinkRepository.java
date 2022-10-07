package pl.private_programing_barman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.private_programing_barman.model.Drink;

public interface DrinkRepository extends JpaRepository<Drink, Integer> {

}
