package pl.private_programing_barman.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.LazyCollection;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "ingredients")

public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (unique = true)
    private int id;


    private String name;

@Column(length = 900)
    private String description;

    private double quantity;

    private String uOm;

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "ingredients")
    private List<Drink> drinks = new ArrayList<>();


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

}
