package pl.private_programing_barman.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.private_programing_barman.dto.IngredientDto;

@Component
public class IngredientDtoConverter implements Converter<String, IngredientDto>{


    @Override
    public IngredientDto convert(String source) {
        return new IngredientDto(Integer.parseInt(source));
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> develop
