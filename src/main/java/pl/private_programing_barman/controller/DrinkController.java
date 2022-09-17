package pl.private_programing_barman.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.service.DrinkService;

import java.util.List;

@Controller
public class HomeController {
    private final DrinkService drinkservice;

    public HomeController(DrinkService drinkservice) {
        this.drinkservice = drinkservice;
    }

    @GetMapping("/")
    public String home(Model model){
        List<DrinkDto> allDrinks = drinkservice.findAllDrinks();
        model.addAttribute("drinks", allDrinks);
        return "index";
    }
}
