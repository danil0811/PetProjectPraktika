package com.mat.app.rest_mongodb.controller;

import com.mat.app.rest_mongodb.form.PetCreateForm;
import com.mat.app.rest_mongodb.form.PetUpdateForm;
import com.mat.app.rest_mongodb.model.Pet;
import com.mat.app.rest_mongodb.service.PetService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/pets")
public class PetsController {

    private final PetService petService;

    public PetsController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public String render() {
        return "index";
    }

    @GetMapping("/list")
    public List<Pet> list() {
        return (List<Pet>) petService.list();
    }

    @GetMapping("/{id}")
    public Optional<Pet> getSinglePet(@PathVariable String id) {
        return petService.getSinglePet(id);
    }

    @PostMapping("/save")
    public Pet savePet(@RequestBody @Valid PetCreateForm form) {
        Pet pet = petService.createPet(new Pet(form.getName(), form.getSpecies(), form.getBreed()));
        return pet;
    }

    @PutMapping("/{id}")
    public Pet updatePet(@PathVariable String id, @RequestBody @Valid PetUpdateForm form) {
        return petService.updatePet(id, new Pet(form.getName(), form.getSpecies(), form.getBreed()));
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable String id) {
        petService.deletePet(id);
    }

    @GetMapping("/species/{species}")
    public List<Pet> listBySpecies(@PathVariable("species") String species) {
        return petService.listBySpecies(species);
    }

    @GetMapping("/breed/{breed}")
    public List<Pet> listByBreed(@PathVariable String breed) {
        return petService.listByBreed(breed);
    }
}

