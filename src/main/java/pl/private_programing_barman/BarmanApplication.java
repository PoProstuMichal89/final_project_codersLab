package pl.private_programing_barman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.IngredientDto;
import pl.private_programing_barman.dto.OpinionDto;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.model.Opinion;
import pl.private_programing_barman.repositories.IngredientRepository;
import pl.private_programing_barman.repositories.OpinionRepository;
import pl.private_programing_barman.service.DrinkService;
import pl.private_programing_barman.service.IngredientService;
import pl.private_programing_barman.service.OpinionService;

import javax.validation.Validator;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootApplication
public class BarmanApplication implements RepositoryRestConfigurer {

    public static void main(String[] args) {
//        SpringApplication.run(BarmanApplication.class, args);
        ConfigurableApplicationContext context = SpringApplication.run(BarmanApplication.class, args);




        List<IngredientDto>  ingredients = new ArrayList<>();
        IngredientDto gin = new IngredientDto("Gin", "Lorem ipsum", 60.00, "ml");
        IngredientDto vermut = new IngredientDto("vermouth", "Lorem ipsum, ipsum", 50.00, "ml");
        IngredientService ingredientService = context.getBean(IngredientService.class);
        ingredientService.add(gin);
        ingredientService.add(vermut);

        ingredients.add(gin);
        ingredients.add(vermut);


//        DrinkService drinkService = context.getBean(DrinkService.class);
//        DrinkDto drink_new = new DrinkDto("Dry Martini", "xxxxx", ingredients, LocalDateTime.now(), LocalDateTime.now() );
//
//        drinkService.add;


//        System.out.println(drinkService.getDrinkDetails(1));
    }






}
