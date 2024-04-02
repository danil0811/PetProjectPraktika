package com.mat.app.rest_mongodb.form;

// Класс представляет форму обновления данных о питомце
public class PetUpdateForm {

    private String name; //Имя питомца
    private String species; // Вид питомца
    private String breed; //Порода питомца

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
