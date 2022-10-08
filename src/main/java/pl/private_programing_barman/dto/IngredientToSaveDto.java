package pl.private_programing_barman.dto;


import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.*;
import java.util.Objects;

public class IngredientToSaveDto {

    @NotBlank
    @Size(min = 2, max = 50)
    private String name;

    @Size(max=900)
    @NotBlank
    private String description;

    @PositiveOrZero
    @Digits(integer = 3, fraction =4 )
//    @Pattern(regexp = ("[0-9]{3}+[0-9]{4}"))
    private double quantity;

    @Pattern(regexp = ("[a-zA-Z]*"))
    @NotBlank
    private String uOm;


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
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                ", uOm='" + uOm + '\'' +
                '}';
    }

}
