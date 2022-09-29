package pl.private_programing_barman.dto;

import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.service.IngredientService;


import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IngredientDto {
    private IngredientService ingredientService;
    private int id;
    private String name;
    private String description;
    private double quantity;

    private String uOm;


    //dodane do konstruktora, żeby zwracał w obiekcie drinki z którymi jest powązany składnik. Czy przeciążać konstruktor bez podawania listy drinków?
    private List<Drink> drinks = new ArrayList<>();


    public IngredientDto(int id, String name, String description, double quantity, String uOm, List<Drink> drinks) {
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

    public List<Drink> getDrinks() {

        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IngredientDto that = (IngredientDto) o;
        return id == that.id && Double.compare(that.quantity, quantity) == 0 && Objects.equals(ingredientService, that.ingredientService) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(uOm, that.uOm) && Objects.equals(drinks, that.drinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientService, id, name, description, quantity, uOm, drinks);
    }
}
