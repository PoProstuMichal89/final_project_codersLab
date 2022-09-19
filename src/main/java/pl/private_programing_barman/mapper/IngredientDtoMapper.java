package pl.private_programing_barman.mapper;

import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.model.Ingredient;

public class IngredientDtoMapper {
    public static IngredientDto map(Ingredient ingredient){
        return new IngredientDto(
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getDescription(),
                ingredient.getQuantity(),
                ingredient.getuOm(),
                ingredient.getDrinks()
        );
    }
}
