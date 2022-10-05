package pl.private_programing_barman.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class DrinkToSaveDto {

    //    private IngredientService ingredientService;
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;
    @Size(max=900)
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

    public List<OpinionDto> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<OpinionDto> opinions) {
        this.opinions = opinions;
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
