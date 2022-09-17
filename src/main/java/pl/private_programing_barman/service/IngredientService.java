package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.mapper.IngredientDtoMapper;
import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.repositories.IngredientRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {
    private final IngredientRepository ingredientrepository;

    public IngredientService(IngredientRepository repository) {
        this.ingredientrepository = repository;
    }

    @Transactional
    public void add(IngredientToSaveDto newIngredient){
        Ingredient ingredient = new Ingredient();
        ingredient.setName(newIngredient.getName());
        ingredient.setDescription(newIngredient.getDescription());
        ingredient.setuOm(newIngredient.getuOm());
        ingredient.setQuantity(newIngredient.getQuantity());
        ingredientrepository.save(ingredient);
    }

    @Transactional
    public void deleteById(int ingredientId){
        ingredientrepository.deleteById(ingredientId);
    }

    @Transactional
    public List<IngredientDto> findAllIngredients(){
        return ingredientrepository.findAll().stream()
                .map(IngredientDtoMapper::map)
                .toList();
    }


    @Transactional
    public Optional<Ingredient> findById(int ingredientId){
        return ingredientrepository.findById(ingredientId);
    }

}
