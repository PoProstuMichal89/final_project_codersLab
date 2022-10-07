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

import javax.transaction.Transactional;
import java.util.*;

@Service
public class DrinkService {
    private final DrinkRepository drinkrepository;

    public DrinkService(DrinkRepository drinkrepository) {
        this.drinkrepository = drinkrepository;

    }

    public List<IngredientToSaveDto> mapIngredientDtoToSaveDto(List<IngredientDto> ingredients){
        List<IngredientToSaveDto> list = new ArrayList<>();
        for (IngredientDto item: ingredients) {
            for(int index = 0; index < list.size(); index++) {
                IngredientToSaveDto newIngredient = new IngredientToSaveDto();
                newIngredient.setName(item.getName());
                newIngredient.setDescription(item.getDescription());
                newIngredient.setQuantity(item.getQuantity());
                newIngredient.setuOm(item.getuOm());
                list.add(newIngredient);
            }
        }
        return list;
    }

    //Mapper listy IngredientToSaveDto na ecnję. Docelowo do przeniesienia do klasy DrinkDtoMapper
    public List<Ingredient> mapIngredientsToEntity(List<IngredientDto> ingredients){
        List<Ingredient> list = new ArrayList<>();
        for(IngredientDto item : ingredients) {

            Ingredient newIngredient = new Ingredient();
            newIngredient.setId(item.getId());
            newIngredient.setName(item.getName());
            newIngredient.setDescription(item.getDescription());
            newIngredient.setQuantity(item.getQuantity());
            newIngredient.setuOm(item.getuOm());
            list.add(newIngredient);

        }
        return list;
    }

    @Transactional
    public void add(DrinkToSaveDto newDrink){
    List<Ingredient> entityIngredients= mapIngredientsToEntity(newDrink.getIngredients());
        Drink drink = new Drink();
        drink.setName(newDrink.getName());
        drink.setDescription(newDrink.getDescription());
        drink.setIngredients(entityIngredients);
        drinkrepository.save(drink);
    }

    @Transactional
    public void deleteById(int drinkId){
        drinkrepository.deleteById(drinkId);
    }

    @Transactional
    public List<DrinkDto> findAllDrinks(){
        return drinkrepository.findAll().stream()
                .map(DrinkDtoMapper::map)
                .toList();
    }

    @Transactional
    public Optional<DrinkDto>findById(int drinkId){
        return drinkrepository.findById(drinkId).map(DrinkDtoMapper::map);
    }

    @Transactional
    public void updateDrink(DrinkDto drink){
        Drink drinkToUpdate = new Drink();
        drinkToUpdate.setId(drink.getId());
        drinkToUpdate.setName(drink.getName());
        drinkToUpdate.setDescription(drink.getDescription());
        drinkToUpdate.setIngredients(drink.getIngredients());
       drinkrepository.save(drinkToUpdate);
    }



}
