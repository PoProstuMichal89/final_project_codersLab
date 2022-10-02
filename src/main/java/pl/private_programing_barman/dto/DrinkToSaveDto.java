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

    private List<Opinion> opinions = new ArrayList<>();

//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;

//    public DrinkToSaveDto(String name, List<Ingredient> ingredients, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
//
//        this.name = name;
//        this.description = description;
//        this.ingredients = ingredients;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
//    }


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

//    public LocalDateTime getCreatedAt() {
//        return createdAt;
//    }
//
//    public void setCreatedAt(LocalDateTime createdAt) {
//        this.createdAt = createdAt;
//    }
//
//    public LocalDateTime getUpdatedAt() {
//        return updatedAt;
//    }
//
//    public void setUpdatedAt(LocalDateTime updatedAt) {
//        this.updatedAt = updatedAt;
//    }

    @Override
    public String toString() {
        return "DrinkDto{" +
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
