package pl.private_programing_barman.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.private_programing_barman.repositories.IngredientRepository;


import java.awt.print.Pageable;

@RestController
public class IngredientController {

//    public static final Logger logger = LoggerFactory.getLogger(IngredientController.class);
//    private final IngredientRepository repository;
//
//    public IngredientController(IngredientRepository repository) {
//        this.repository = repository;
//    }
//
//    @GetMapping(value="/ingredients", params={"!sort", "!page", "!size"})
//    ResponseEntity<?>readAllIngredients(){
//        logger.warn("Exposing all the task!");
//        return ResponseEntity.ok(repository.findAll());
//
//    }
//
///*    @GetMapping("/ingredients")
//    ResponseEntity<?>readAllIngredients(Pageable page){
//        logger.info("Custpmer page!");
//        return ResponseEntity.ok(repository.findAll(page));
//
//    }*/
}
