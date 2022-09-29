package pl.private_programing_barman.dto;


import java.util.Objects;

public class IngredientToSaveDto {
    private String name;
    private String description;
    private double quantity;
    private String uOm;

//    public IngredientToSaveDto(String name, String description, double quantity, String uOm) {
//        this.name = name;
//        this.description = description;
//        this.quantity = quantity;
//        this.uOm = uOm;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IngredientToSaveDto that = (IngredientToSaveDto) o;
        return Double.compare(that.quantity, quantity) == 0 && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(uOm, that.uOm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, quantity, uOm);
    }
}
