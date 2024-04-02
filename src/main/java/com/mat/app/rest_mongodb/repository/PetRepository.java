package com.mat.app.rest_mongodb.repository;

import com.mat.app.rest_mongodb.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PetRepository extends CrudRepository<Pet, String> {
    // Методы для поиска питомцев по определенным критериям
    List<Pet> findBySpecies(String species);

    List<Pet> findByBreed(String breed);

    List<Pet> findAll();

    void deleteById(String id);

    Optional<Pet> findById(String id);
}
