package pl.private_programing_barman.mapper;

import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.model.Ingredient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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


    public static IngredientToSaveDto mapToSave(IngredientDto ingredient) {
        IngredientToSaveDto toSaveIngredeint = new IngredientToSaveDto();
        toSaveIngredeint.setName(ingredient.getName());
        toSaveIngredeint.setDescription(ingredient.getDescription());
        toSaveIngredeint.setQuantity(ingredient.getQuantity());
        toSaveIngredeint.setuOm(ingredient.getuOm());

        return toSaveIngredeint;
    }

    //Mapper listy IngredientToSaveDto na ecnję
    public static List<Ingredient> mapIngredientsToEntity(List<IngredientDto> ingredients) {
        List<Ingredient> list = new ArrayList<>();
        for (IngredientDto item : ingredients) {

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

    //    public List<IngredientToSaveDto> mapIngredientDtoToSaveDto(List<IngredientDto> ingredients) {
//        List<IngredientToSaveDto> list = new ArrayList<>();
//        for (IngredientDto item : ingredients) {
//            for (int index = 0; index < list.size(); index++) {
//                IngredientToSaveDto newIngredient = new IngredientToSaveDto();
//                newIngredient.setName(item.getName());
//                newIngredient.setDescription(item.getDescription());
//                newIngredient.setQuantity(item.getQuantity());
//                newIngredient.setuOm(item.getuOm());
//                list.add(newIngredient);
//            }
//        }
//        return list;
//    }
//

}