package pl.private_programing_barman.mapper;

import pl.private_programing_barman.dto.DrinkDto;
import pl.private_programing_barman.dto.OpinionDto;
import pl.private_programing_barman.model.Drink;
import pl.private_programing_barman.model.Opinion;

public class OpinionDtoMapper {
    public static OpinionDto map(Opinion opinion){
        return new OpinionDto(
                opinion.getId(),
                opinion.getNickname(),
                opinion.getContent(),
                opinion.getRate()
        );
    }
}
