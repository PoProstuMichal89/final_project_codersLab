package pl.private_programing_barman.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.private_programing_barman.model.Opinion;

public interface OpinionRepository extends JpaRepository<Opinion, Integer> {
}
