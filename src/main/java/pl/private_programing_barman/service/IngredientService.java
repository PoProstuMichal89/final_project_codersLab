package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.repositories.IngredientRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IngredientService {
    private final IngredientRepository ingredientrepository;

    public IngredientService(IngredientRepository repository) {
        this.ingredientrepository = repository;
    }

    @Transactional
    public void add(IngredientDto newIngredient){
        Ingredient ingredient = new Ingredient(
                newIngredient.getName(),
                newIngredient.getDescription(),
                newIngredient.getQuantity(),
                newIngredient.getuOm());
        ingredientrepository.save(ingredient);
    }

    @Transactional
    public void deleteById(int ingredientId){
        ingredientrepository.deleteById(ingredientId);
    }

    @Transactional
    public List<IngredientDto> findAllIngredients(){
        return ingredientrepository.findAll().stream().map(ingredient -> new IngredientDto(
                ingredient.getName(),
                ingredient.getDescription(),
                ingredient.getQuantity(),
                ingredient.getuOm()
        )).collect(Collectors.toList());
    }


    //nie wiem jak to rozwiązać żeby przez servcie mieć dostęp do DTO a nie do Encji!!!
    @Transactional
    public Optional<Ingredient> findById(int ingredientId){
        return ingredientrepository.findById(ingredientId);
    }

}
