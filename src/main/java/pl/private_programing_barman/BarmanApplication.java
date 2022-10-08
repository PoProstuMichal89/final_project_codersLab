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
        SpringApplication.run(BarmanApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(BarmanApplication.class, args);

    }
}
