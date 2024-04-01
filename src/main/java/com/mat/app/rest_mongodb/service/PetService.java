package com.mat.app.rest_mongodb.service;

import com.mat.app.rest_mongodb.model.Pet;

import java.util.List;
import java.util.Optional;

public interface PetService {
    Iterable<Pet> list();
    Optional<Pet> getSinglePet(String id);
    Pet createPet(Pet pet);
    Pet updatePet(String id, Pet pet);

    Pet updatePet(Long id, Pet pet);

    void deletePet(String id);
    List<Pet> listBySpecies(String species);
    List<Pet> listByBreed(String breed);
}
