package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.OpinionDto;
import pl.private_programing_barman.dto.OpinionToSaveDto;
import pl.private_programing_barman.mapper.OpinionDtoMapper;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Opinion;
import pl.private_programing_barman.repository.DrinkRepository;
import pl.private_programing_barman.repository.OpinionRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class OpinionService {
    private final OpinionRepository opinionrepository;
    private final DrinkRepository drinkRepository;

    public OpinionService(OpinionRepository opinionrepository, DrinkRepository drinkRepository) {
        this.opinionrepository = opinionrepository;
        this.drinkRepository = drinkRepository;
    }

    @Transactional
    public void add(OpinionToSaveDto newOpinion, int id) {
       Drink drink = drinkRepository.findById(id).orElseThrow();

       Opinion opinion = new Opinion();
        opinion.setNickname(newOpinion.getNickname());
        opinion.setContent(newOpinion.getContent());
        opinion.setRate(newOpinion.getRate());
        opinion.setDrink(drink);
        opinionrepository.save(opinion);
        drink.getOpinions().add(opinion);
    }

    @Transactional
    public void deleteById(int opinionId) {
        opinionrepository.deleteById(opinionId);
    }

    @Transactional
    public List<OpinionDto> findAllOpinion() {
        return opinionrepository.findAll().stream()
                .map(OpinionDtoMapper::map)
                .toList();

    }

    @Transactional
    public Optional<Opinion> findById(int opinionId) {
        return opinionrepository.findById(opinionId);
    }


}



