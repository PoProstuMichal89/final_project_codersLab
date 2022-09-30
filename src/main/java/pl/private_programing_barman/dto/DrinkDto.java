package pl.private_programing_barman.dto;

import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.model.Opinion;
import pl.private_programing_barman.service.IngredientService;

import java.time.LocalDateTime;
import java.util.*;

public class DrinkDto {
    private IngredientService ingredientService;
    private int id;
    private String name;
    private String description;

    private Set<IngredientDto> ingredients = new HashSet<>();

    private List<Opinion> opinions = new ArrayList<>();

//    private LocalDateTime createdAt;
//    private LocalDateTime updatedAt;

    public DrinkDto(int id, String name, Set<IngredientDto> ingredients, String description) {
        this.id=id;
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
//        this.createdAt = createdAt;
//        this.updatedAt = updatedAt;
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

    public Set<IngredientDto> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<IngredientDto> ingredients, int ingredientId) {
       Optional<IngredientDto> ingredient= ingredientService.findById(ingredientId);
       ingredient.ifPresent(ingredientDto -> {
           IngredientDto ingredientDto1 = new IngredientDto(
                   ingredientDto.getId(),
                   ingredientDto.getName(),
                   ingredientDto.getDescription(),
                   ingredientDto.getQuantity(),
                   ingredientDto.getuOm());
           ingredients.add(ingredientDto1);
       });

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
