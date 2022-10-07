package pl.private_programing_barman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.OpinionToSaveDto;
import pl.private_programing_barman.service.DrinkService;
import pl.private_programing_barman.service.OpinionService;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class OpinionController {

    private final DrinkService drinkService;
    private final OpinionService opinionService;

    public OpinionController(DrinkService drinkService, OpinionService opinionService) {
        this.drinkService = drinkService;
        this.opinionService = opinionService;
    }

    //DODAWANIE OPINII
    @GetMapping("/add-opinion/{id}")
    public String addOpinionForm(@PathVariable int id, Model model) {
        Optional<DrinkDto> optionalDrink = drinkService.findById(id);
        optionalDrink.ifPresent(drink -> model.addAttribute("drink", drink));

        OpinionToSaveDto opinion = new OpinionToSaveDto();
        model.addAttribute("opinion", opinion);

        int[] rateRange= {1,2,3,4,5,6};
        model.addAttribute("rateRange", rateRange);

        return "/opinion-form";
    }

    @PostMapping("/add-opinion/{id}")
    public String addOpinion(@Valid @ModelAttribute("opinion") OpinionToSaveDto opinion, BindingResult bindingResult, Model model, @PathVariable int id) {
        if (bindingResult.hasErrors()) {
            Optional<DrinkDto> optionalDrink = drinkService.findById(id);
            optionalDrink.ifPresent(drink -> model.addAttribute("drink", drink));

            int[] rateRange= {1,2,3,4,5,6};
            model.addAttribute("rateRange", rateRange);

            return "/opinion-form";
        } else {
            opinionService.add(opinion, id);
            return "redirect:/drink/{id}";
        }

    }
}
