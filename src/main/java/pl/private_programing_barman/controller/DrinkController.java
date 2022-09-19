package pl.private_programing_barman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.DrinkToSaveDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.service.DrinkService;
import pl.private_programing_barman.service.IngredientService;

import java.util.List;

@Controller
public class DrinkController {
    private final DrinkService drinkservice;
    private final IngredientService ingredientService;

    public DrinkController(DrinkService drinkservice, IngredientService ingredientService) {
        this.drinkservice = drinkservice;
        this.ingredientService = ingredientService;
    }

    @GetMapping("/drinks")
    public String drinksList(Model model){
        List<DrinkDto> allDrinks = drinkservice.findAllDrinks();
        model.addAttribute("drinks", allDrinks);
        return "drinks-list";
    }

    //wyświetlanie formularza do dodania Drinka
    @GetMapping("/add-drink")
    public String addDrinkForm(Model model){
        DrinkToSaveDto drink = new DrinkToSaveDto();
        model.addAttribute("drink", drink);

        List<IngredientDto> allIngredients = ingredientService.findAllIngredients();
        model.addAttribute("allIngredients", allIngredients);
        return "drink-form";
    }
}
