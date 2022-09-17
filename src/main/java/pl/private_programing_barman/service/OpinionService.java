package pl.private_programing_barman.service;

import org.springframework.stereotype.Service;
import pl.private_programing_barman.dto.OpinionDto;
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
    public void add(OpinionDto newOpinion) {
        Opinion opinion = new Opinion(
                newOpinion.getContent(),
                newOpinion.getNickname(),
                newOpinion.getRate());
        opinionrepository.save(opinion);
    }

    @Transactional
    public void deleteById(int opinionId) {
        opinionrepository.deleteById(opinionId);
    }

    @Transactional
    public List<OpinionDto> findAllOpinion() {
        return opinionrepository.findAll().stream().map(opinion -> new OpinionDto(
                opinion.getNickname(),
                opinion.getContent(),
                opinion.getRate()
        )).collect(Collectors.toList());
    }

    @Transactional
    public Optional<Opinion> findById(int opinionId) {
        return opinionrepository.findById(opinionId);
    }

    @Transactional
    public Opinion getOpinion(OpinionDto opinionDto) {
        Opinion opinia1 = new Opinion(opinionDto.getNickname(), opinionDto.getContent(), opinionDto.getRate());
        return opinia1;
    }

//    @Transactional
//    public Opinion getOpinionById(int opinionId) {
//       Optional<Opinion> opinionss= opinionrepository.findById(opinionId);
//        Opinion opinia1 = new Opinion(opinionss.getNickname(), opinionDto.getContent(), opinionDto.getRate());
//        return opinia1;
    }



