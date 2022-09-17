package pl.private_programing_barman.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.repositories.IngredientRepository;
import pl.private_programing_barman.service.IngredientService;


import java.awt.print.Pageable;
import java.util.List;

@Controller
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/ingredients")
    public String ingredientsList(Model model){
        List<IngredientDto> allIngredients = ingredientService.findAllIngredients();
        model.addAttribute("ingredients", allIngredients);
        return "ingredients-list";
    }


}