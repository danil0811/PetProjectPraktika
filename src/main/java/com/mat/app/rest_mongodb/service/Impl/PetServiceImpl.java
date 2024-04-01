package com.mat.app.rest_mongodb.service.Impl;

import com.mat.app.rest_mongodb.model.Pet;
import com.mat.app.rest_mongodb.repository.PetRepository;
import com.mat.app.rest_mongodb.service.PetService;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class PetServiceImpl implements PetService {

    private final PetRepository petRepository;

    public PetServiceImpl(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public List<Pet> list() {
        return petRepository.findAll();
    }

    @Override
    public Optional<Pet> getSinglePet(String id) {
        return petRepository.findById(id);
    }

    @Override
    public Pet createPet(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public Pet updatePet(String id, Pet pet) {
        return null;
    }

    @Override
    public Pet updatePet(Long id, Pet pet) {
        pet.setId(id);
        return petRepository.save(pet);
    }

    @Override
    public void deletePet(String id) {
        petRepository.deleteById(id);
    }

    @Override
    public List<Pet> listBySpecies(String species) {
        return petRepository.findBySpecies(species);
    }

    @Override
    public List<Pet> listByBreed(String breed) {
        return petRepository.findByBreed(breed);
    }
}
