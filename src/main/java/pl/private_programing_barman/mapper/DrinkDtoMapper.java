package pl.private_programing_barman.mapper;

import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Ingredient;

import java.util.ArrayList;
import java.util.List;


public class DrinkDtoMapper {

    //Mapowanie listy składników na listę DTO
    public static List<IngredientDto> mapIngredientsToDto(List<Ingredient> ingredients) {
        List<IngredientDto> list = new ArrayList<>();

        for (Ingredient item : ingredients) {

            for (int index = 0; index < list.size(); index++) {
                IngredientDto newInredient = new IngredientDto(item.getId(), item.getName(), item.getDescription(), item.getQuantity(), item.getuOm());
                list.add(newInredient);
            }
        }

        return list;
    }

    ;


    public static DrinkDto map(Drink drink) {

        List<Ingredient> ingredientDtoList = drink.getIngredients();
//        List<Ingredient> ingedientDtoList = mapIngredientsToDto(ingredientList);

        return new DrinkDto(
                drink.getId(),
                drink.getName(),
                ingredientDtoList,
                drink.getDescription()
        );
    }
}

