package pl.private_programing_barman.mapper;

import org.springframework.context.annotation.Bean;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Ingredient;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class DrinkDtoMapper {

    //Mapowanie listy składników na listę DTO
    public static Set<IngredientDto> mapIngredientsToDto(Set<Ingredient> ingredients){
       Set<IngredientDto> list = new HashSet<>();

        for(Ingredient item : ingredients) {

            for(int index = 0; index < list.size(); index++) {
                IngredientDto newInredient = new IngredientDto(item.getId(), item.getName(), item.getDescription(), item.getQuantity(), item.getuOm());
                list.add(newInredient);
            }
        }

            return list;
    };


    public static DrinkDto map(Drink drink){

       Set<Ingredient> ingredientList = drink.getIngredients();
      Set<IngredientDto> ingedientDtoList= mapIngredientsToDto(ingredientList);

         return new DrinkDto(
                 drink.getId(),
                 drink.getName(),
                 ingedientDtoList,
                 drink.getDescription()
//                 drink.getCreatedAt(),
//                 drink.getUpdatedAt()
         );
         }
     }

