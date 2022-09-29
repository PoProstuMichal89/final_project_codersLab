package pl.private_programing_barman.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "ingredient_id", unique = true)
    private int id;

    private String name;

@Column(length = 900)
    private String description;

    private double quantity;

    private String uOm;


    @ManyToMany( cascade = {CascadeType.PERSIST, CascadeType.MERGE}, mappedBy = "ingredients", fetch = FetchType.EAGER)
    @Fetch(FetchMode.SUBSELECT)
    private List<Drink> drinks = new ArrayList<>();



//czy potrzebne są id w knstruktorze?!

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id && Double.compare(that.quantity, quantity) == 0 && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(uOm, that.uOm) && Objects.equals(drinks, that.drinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, quantity, uOm, drinks);
    }
}
