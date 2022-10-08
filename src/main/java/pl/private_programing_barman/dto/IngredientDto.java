package pl.private_programing_barman.dto;

import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.service.IngredientService;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

public class IngredientDto {
    private IngredientService ingredientService;
    private int id;
    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @Size(max = 900)
    @NotBlank
    private String description;

    private double quantity;

    private String uOm;

    private Set<Drink> drinks = new HashSet<>();


    public IngredientDto(int id, String name, String description, double quantity, String uOm, Set<Drink> drinks) {
        this.drinks = drinks;
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.uOm = uOm;
    }

    public IngredientDto(int id) {
        this.id = id;
    }

    //konstruktor bez podawania listy drinków!
    public IngredientDto(int id, String name, String description, double quantity, String uOm) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.uOm = uOm;
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getuOm() {
        return uOm;
    }

    public void setuOm(String uOm) {
        this.uOm = uOm;
    }

    public Set<Drink> getDrinks() {

        return drinks;
    }

    public void setDrinks(Set<Drink> drinks) {

        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "IngredientDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", uOm='" + uOm + '\'' +
                '}';
    }


}
