package pl.private_programing_barman.dto;

import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.model.Opinion;
import pl.private_programing_barman.service.IngredientService;

import java.time.LocalDateTime;
import java.util.*;

public class DrinkToSaveDto {

    private IngredientService ingredientService;
    private String name;
    private String description;

    private List<IngredientDto> ingredients = new ArrayList<>();

    private List<OpinionDto> opinions = new ArrayList<>();


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

    public List<IngredientDto> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<IngredientDto> ingredients) {

        this.ingredients = ingredients;
    }


    @Override
    public String toString() {
        return "DrinkDto{" +
                ", name='" + name + '\'' +
                ", Description='" + description + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }



}
