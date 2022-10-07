package pl.private_programing_barman.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.*;

@Entity
@Table(name="drinks")
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "The 'name' field cannot be empty")
    @Size(min=2, max=50, message = "The 'name' length must be between 2 and 50 characters")
    private String name;

    @Column(length = 900)
    @Size(max=900)
    @NotBlank
    private String description;


    @ManyToMany( cascade = {CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JoinTable(name="drink_ingredients", joinColumns = {@JoinColumn(referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(referencedColumnName = "id")})
    private List<Ingredient> ingredients = new ArrayList<>();



    @OneToMany(mappedBy = "drink", orphanRemoval = true)
    private List<Opinion> opinions = new ArrayList<>();

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

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }



    public List<Opinion> getOpinions() {
        return opinions;
    }

    public void setOpinions(List<Opinion> opinions) {
        this.opinions = opinions;
    }



}
