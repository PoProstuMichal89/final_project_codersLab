package pl.private_programing_barman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.DrinkToSaveDto;
import pl.private_programing_barman.dto.IngredientToSaveDto;
import pl.private_programing_barman.service.DrinkService;
import pl.private_programing_barman.service.IngredientService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@SpringBootApplication
public class BarmanApplication implements RepositoryRestConfigurer {

    public static void main(String[] args) {
//        SpringApplication.run(BarmanApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(BarmanApplication.class, args);



        List<IngredientToSaveDto>  ingredients = new ArrayList<>();
//     IngredientToSaveDto gin = new IngredientToSaveDto("Gin", "Lorem Ipsum", 20.00, "ml" );
//        IngredientToSaveDto vermut = new IngredientToSaveDto("Vermut", "Lorem Ipsum", 20.00, "ml" );

//        IngredientService ingredientService = context.getBean(IngredientService.class);
//        ingredientService.add(gin);
//        ingredientService.add(vermut);
//
//        ingredients.add(gin);
//        ingredients.add(vermut);


        DrinkService drinkService = context.getBean(DrinkService.class);
//        DrinkToSaveDto drink_new = new DrinkToSaveDto("Martini", ingredients, "xxxx", LocalDateTime.now(), LocalDateTime.now());

//        drinkService.add(drink_new);


//        System.out.println(drinkService.getDrinkDetails(1));
    }






}
