package pl.private_programing_barman.mapper;

import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.model.Ingredient;

public class IngredientDtoMapper {
    public static IngredientDto map(Ingredient ingredient) {
        return new IngredientDto(
                ingredient.getId(),
                ingredient.getName(),
                ingredient.getDescription(),
                ingredient.getQuantity(),
                ingredient.getuOm(),
                ingredient.getDrinks()
        );
    }

//    public static IngredientToSaveDto mapToForm(Ingredient ingredient) {
//        IngredientToSaveDto toSaveIngredeint = new IngredientToSaveDto();
//        toSaveIngredeint.setName(ingredient.getName());
//        toSaveIngredeint.setDescription(ingredient.getDescription());
//        toSaveIngredeint.setQuantity(ingredient.getQuantity());
//        toSaveIngredeint.setuOm(ingredient.getuOm());
//
//        return toSaveIngredeint;
//    }
}