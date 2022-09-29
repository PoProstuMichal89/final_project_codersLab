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

    private Set<IngredientDto> ingredients = new HashSet<>();

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

    public Set<IngredientDto> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<IngredientDto> ingredients) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrinkToSaveDto that = (DrinkToSaveDto) o;
        return Objects.equals(ingredientService, that.ingredientService) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(ingredients, that.ingredients) && Objects.equals(opinions, that.opinions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientService, name, description, ingredients, opinions);
    }
}
