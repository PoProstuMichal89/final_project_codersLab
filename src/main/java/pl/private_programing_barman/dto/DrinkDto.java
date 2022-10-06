package pl.private_programing_barman.dto;

import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.model.Opinion;
import pl.private_programing_barman.service.IngredientService;

import java.time.LocalDateTime;
import java.util.*;
import javax.validation.constraints.*;

public class DrinkDto {

    private int id;

    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @Size(max=900)
    @NotBlank
    private String description;

    private List<Ingredient> ingredients = new ArrayList<>();

    private List<Opinion> opinions = new ArrayList<>();


//    public DrinkDto(int id, String name, List<Ingredient> ingredients, String description) {
//        this.id=id;
//        this.name = name;
//        this.description = description;
//        this.ingredients = ingredients;
//    }

    public DrinkDto(int id, String name, String description, List<Ingredient> ingredients, List<Opinion> opinions) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.opinions = opinions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

//    public void setIngredients(List<IngredientDto> ingredients, int ingredientId) {
//       Optional<IngredientDto> ingredient= ingredientService.findById(ingredientId);
//       ingredient.ifPresent(ingredientDto -> {
//           IngredientDto ingredientDto1 = new IngredientDto(
//                   ingredientDto.getId(),
//                   ingredientDto.getName(),
//                   ingredientDto.getDescription(),
//                   ingredientDto.getQuantity(),
//                   ingredientDto.getuOm());
//           ingredients.add(ingredientDto1);
//       });
//
//        this.ingredients = ingredients;
//    }


    @Override
    public String toString() {
        return "DrinkDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", ingredients=" + ingredients +
//                ", createdAt=" + createdAt +
//                ", updatedAt=" + updatedAt +
                '}';
    }

    public List<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Opinion> opinions) {
        this.opinions = opinions;
    }


}
