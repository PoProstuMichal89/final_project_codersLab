package pl.private_programing_barman.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class IngredientDto {
    private int id;
    private String name;
    private String description;
    private double quantity;
    private String uOm;

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
