package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.mapper.IngredientDtoMapper;
import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.repository.IngredientRepository;

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
                .collect(Collectors.toList());
    }

//    @Transactional
//    public List<IngredientToSaveDto> findAllIngredientsToForm(){
//        return ingredientrepository.findAll().stream().map(IngredientDtoMapper::mapToForm).toList();
//    }


    @Transactional
    public Optional<IngredientDto> findById(int ingredientId){
        return ingredientrepository.findById(ingredientId).map(IngredientDtoMapper::map);
    }

    @Transactional
    public Optional<IngredientDto>findByName(String name){
        return ingredientrepository.findByName(name).map(IngredientDtoMapper::map);
    }

}
