package pl.private_programing_barman.mapper;

import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.model.Drink;


public class DrinkDtoMapper {
    public static DrinkDto map(Drink drink){
         return new DrinkDto(
                 drink.getId(),
                 drink.getName(),
                 drink.getIngredients(),
                 drink.getDescription(),
                 drink.getCreatedAt(),
                 drink.getUpdatedAt()

         );
         }
     }

