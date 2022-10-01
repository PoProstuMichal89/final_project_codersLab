package pl.private_programing_barman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.DrinkToSaveDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.mapper.IngredientDtoMapper;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.service.DrinkService;
import pl.private_programing_barman.service.IngredientService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class BarmanApplication implements RepositoryRestConfigurer {

    public static void main(String[] args) {
//        SpringApplication.run(BarmanApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(BarmanApplication.class, args);


<<<<<<< HEAD
        IngredientService ingredientService = context.getBean(IngredientService.class);

        List<IngredientDto> ingredients = new ArrayList<>();
        Optional<IngredientDto> gin = ingredientService.findById(2);
        gin.ifPresent(item -> ingredients.add(item));

        Optional<IngredientDto> vermut = ingredientService.findById(3);
        vermut.ifPresent(item -> ingredients.add(item));

        DrinkService drinkService = context.getBean(DrinkService.class);
        DrinkToSaveDto newDrink = new DrinkToSaveDto();
//        newDrink.setIngredients(ingredients);
        newDrink.setName("Blue Curacao");
        newDrink.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ex mauris. Ut vel hendrerit tortor. Nulla venenatis neque mauris, nec dapibus odio fringilla id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Sed consequat metus id lacus vulputate vestibulum. Donec dignissim, ipsum ac lobortis rhoncus, nisl nisi mattis erat, in consequat est augue sit amet turpis.");
        drinkService.add(newDrink);
=======
//        IngredientService ingredientService = context.getBean(IngredientService.class);
//
//        List<IngredientDto> ingredients = new ArrayList<>();
//        Optional<IngredientDto> gin = ingredientService.findById(2);
////        gin.ifPresent(item -> ingredients.add(item));
//
//        Optional<IngredientDto> vermut = ingredientService.findById(3);
////        vermut.ifPresent(item -> ingredients.add(item));
//
//        DrinkService drinkService = context.getBean(DrinkService.class);
//        DrinkToSaveDto newDrink = new DrinkToSaveDto();
////        newDrink.setIngredients(ingredients);
//        newDrink.setName("Blue Curacao");
//        newDrink.setDescription("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent a ex mauris. Ut vel hendrerit tortor. Nulla venenatis neque mauris, nec dapibus odio fringilla id. Interdum et malesuada fames ac ante ipsum primis in faucibus. Sed consequat metus id lacus vulputate vestibulum. Donec dignissim, ipsum ac lobortis rhoncus, nisl nisi mattis erat, in consequat est augue sit amet turpis.");
//        drinkService.add(newDrink);
>>>>>>> develop


//
//        ingredientService.add(gin);
//        ingredientService.add(vermut);
//
//        ingredients.add(gin);
//        ingredients.add(vermut);
//
//
//
//
//        drinkService.add(drink_new);
//
//
//        System.out.println(drinkService.getDrinkDetails(1));
    }


}
