package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.DrinkToSaveDto;
import pl.private_programing_barman.mapper.DrinkDtoMapper;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Ingredient;
import pl.private_programing_barman.repositories.DrinkRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DrinkService {
    private final DrinkRepository drinkrepository;

    public DrinkService(DrinkRepository drinkrepository) {
        this.drinkrepository = drinkrepository;
    }

    @Transactional
    public void add(DrinkToSaveDto newDrink){
        Drink drink = new Drink();
        drink.setName(newDrink.getName());
        drink.setDescription(newDrink.getDescription());
        drink.setIngredients(newDrink.getIngredients());
        drink.setCreatedAt(newDrink.getCreatedAt());
        drinkrepository.save(drink);
    }

    @Transactional
    public void deletyById(int drinkId){
        drinkrepository.deleteById(drinkId);
    }

    @Transactional
    public List<DrinkDto> findAllDrinks(){
        return drinkrepository.findAll().stream()
                .map(DrinkDtoMapper::map)
                .toList();
    }



    @Transactional
    public Optional<Drink>findById(int drinkId){
        return drinkrepository.findById(drinkId);
    }

    @Transactional
    public void addIngredient(Ingredient ingredient, DrinkDto drinkDto){
        drinkDto.getIngredients().add(ingredient);
    }

//    @Transactional
//    public DrinkDto getDrinkDetails(int drinkId){
//        Drink drink1= new Drink();
//        Optional<Drink> drink = drinkrepository.findById(2);
//        if(drink.isPresent()){
//             drink1 = drink.get();
//        }
//        DrinkDto drinkDetail = new DrinkDto(
//                drink1.getId(),
//                drink1.getName(),
//                drink1.getDescription(),
//                drink1.getIngredients(),
//                drink1.getCreatedAt(),
//                drink1.getUpdatedAt()
//                );
//        return drinkDetail;
//    }


}
