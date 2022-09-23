package pl.private_programing_barman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.service.IngredientService;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

@Controller
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    //wyświetlenie wszystkich składników
    @GetMapping("/ingredients")
    public String ingredientsList(Model model){
        List<IngredientDto> allIngredients = ingredientService.findAllIngredients();
        model.addAttribute("ingredients", allIngredients);
        return "ingredients-list";
    }

    //wyświetlanie formularza do dodania składnika
    @GetMapping("/add-ingredient")
    public String addIngredientForm(Model model){
        IngredientToSaveDto ingredient = new IngredientToSaveDto();
        model.addAttribute("ingredient", ingredient);
        return "ingredient-form";

    }

    @PostMapping("/add-ingredient")
    public String addIngredeint(IngredientToSaveDto ingredient, RedirectAttributes redirectAttributes){
        ingredientService.add(ingredient);
        return "redirect:/ingredients";

    }

    //wyświetlenie detli składnika
    @GetMapping("/ingredient/{id}")
    public String getIngredient(@PathVariable int id, Model model){
        Optional<IngredientDto> optionalIngredient = ingredientService.findById(id);
        optionalIngredient.ifPresent(ingredient -> model.addAttribute("ingredient", ingredient));


        return "ingredient";
    }


}
