package pl.private_programing_barman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.DrinkToSaveDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.service.DrinkService;
import pl.private_programing_barman.service.IngredientService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class DrinkController {
    private final DrinkService drinkservice;
    private final IngredientService ingredientService;


    public DrinkController(DrinkService drinkservice, IngredientService ingredientService) {
        this.drinkservice = drinkservice;
        this.ingredientService = ingredientService;

    }

    @GetMapping("/drinks")
    public String drinksList(Model model) {
        List<DrinkDto> allDrinks = drinkservice.findAllDrinks();
        model.addAttribute("drinks", allDrinks);
        return "drinks-list";
    }

    //wyświetlanie formularza do dodania Drinka
    @GetMapping("/add-drink")
    public String addDrinkForm(Model model) {
        DrinkToSaveDto drink = new DrinkToSaveDto();
        model.addAttribute("drink", drink);

        List<IngredientDto> allIngredients = ingredientService.findAllIngredients();
        model.addAttribute("allIngredients", allIngredients);
        return "drink-form";
    }

    @PostMapping("/add-drink")
    public String addDrink(DrinkToSaveDto drink) {
        drinkservice.add(drink);
        return "redirect:/drinks";
    }

    //widok detali drinka
    @GetMapping("/drink/{id}")
    public String getDrink(@PathVariable int id, Model model) {
        Optional<DrinkDto> optionalDrink = drinkservice.findById(id);
        optionalDrink.ifPresent(drink -> model.addAttribute("drink", drink));
        return "drink";
    }

    //usuwanie drinka
    @GetMapping("/delete-drink/{id}")
    public String deleteDrink(@PathVariable int id) {
        drinkservice.deleteById(id);

        return "redirect:/drinks";
    }




    //EDYCJA DRINKA
    @GetMapping("/edit-drink/{id}")
    public String editDrinkForm(@PathVariable int id, Model model) {
        Optional<DrinkDto> optionalDrink = drinkservice.findById(id);
        optionalDrink.ifPresent(drink -> model.addAttribute("drink", drink));

        List<IngredientDto> allIngredients = ingredientService.findAllIngredients();
        model.addAttribute("allIngredients", allIngredients);

        return "drink-edit-form";
    }

    @PostMapping("/edit-drink/{id}")
    public String editDrink(DrinkDto drink) {
        drinkservice.updateDrink(drink);
        return "redirect:/drinks";
    }
}
