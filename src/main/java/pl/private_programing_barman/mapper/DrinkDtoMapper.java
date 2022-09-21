package pl.private_programing_barman.mapper;

import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Ingredient;

import java.util.ArrayList;
import java.util.List;


public class DrinkDtoMapper {

    //dodanie mapowania listy składników z encji na IngredientDto
    public static List<IngredientDto> mapDrinkList(List<Ingredient> ingredients){
       List<IngredientDto> list = new ArrayList<>();

        for(Ingredient item : ingredients) {

            for(int index = 0; index < list.size(); index++) {
                IngredientDto newInredient = new IngredientDto(item.getId(), item.getName(), item.getDescription(), item.getQuantity(), item.getuOm());
                list.add(newInredient);
            }
        }

            return list;
    };
    public static DrinkDto map(Drink drink){

       List<Ingredient> ingredientList = drink.getIngredients();
      List<IngredientDto> ingedientDtoList= mapDrinkList(ingredientList);

         return new DrinkDto(
                 drink.getId(),
                 drink.getName(),
                 ingedientDtoList,
                 drink.getDescription(),
                 drink.getCreatedAt(),
                 drink.getUpdatedAt()

         );
         }
     }

