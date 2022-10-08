package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.DrinkToSaveDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.mapper.DrinkDtoMapper;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.repository.DrinkRepository;
import pl.private_programing_barman.mapper.IngredientDtoMapper;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DrinkService {
    private final DrinkRepository drinkrepository;

    public DrinkService(DrinkRepository drinkrepository) {
        this.drinkrepository = drinkrepository;

    }

    @Transactional
    public void add(DrinkToSaveDto newDrink) {
        IngredientDtoMapper mapper = new IngredientDtoMapper();
        List<Ingredient> entityIngredients = mapper.mapIngredientsToEntity(newDrink.getIngredients());
        Drink drink = new Drink();
        drink.setName(newDrink.getName());
        drink.setDescription(newDrink.getDescription());
        drink.setIngredients(entityIngredients);
        drinkrepository.save(drink);
    }

    @Transactional
    public void deleteById(int drinkId) {
        drinkrepository.deleteById(drinkId);
    }

    @Transactional
    public List<DrinkDto> findAllDrinks() {
        return drinkrepository.findAll().stream()
                .map(DrinkDtoMapper::map)
                .toList();
    }

    @Transactional
    public Optional<DrinkDto> findById(int drinkId) {
        return drinkrepository.findById(drinkId).map(DrinkDtoMapper::map);
    }

    @Transactional
    public void updateDrink(DrinkDto drink) {
        Drink drinkToUpdate = new Drink();
        drinkToUpdate.setId(drink.getId());
        drinkToUpdate.setName(drink.getName());
        drinkToUpdate.setDescription(drink.getDescription());
        drinkToUpdate.setIngredients(drink.getIngredients());
        drinkrepository.save(drinkToUpdate);
    }
}
