package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.OpinionDto;
import pl.private_programing_barman.dto.OpinionToSaveDto;
import pl.private_programing_barman.mapper.OpinionDtoMapper;
import pl.private_programing_barman.model.Opinion;
import pl.private_programing_barman.repositories.OpinionRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OpinionService {
    private final OpinionRepository opinionrepository;

    public OpinionService(OpinionRepository opinionrepository) {
        this.opinionrepository = opinionrepository;
    }

    @Transactional
    public void add(OpinionToSaveDto newOpinion) {
      Opinion opinion = new Opinion();
      opinion.setNickname(newOpinion.getNickname());
      opinion.setContent(newOpinion.getContent());
      opinion.setRate(newOpinion.getRate());
      opinionrepository.save(opinion);
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



