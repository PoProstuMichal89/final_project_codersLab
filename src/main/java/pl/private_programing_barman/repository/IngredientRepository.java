package pl.private_programing_barman.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.private_programing_barman.model.Ingredient;

import java.util.Optional;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    Optional<Ingredient> findById(int id);
    Optional<Ingredient> findByName(String name);

}
