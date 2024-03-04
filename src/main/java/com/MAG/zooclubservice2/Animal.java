package com.MAG.zooclubservice2;

public abstract class Animal implements AnimalInterface{
private String name;
private String breed;
private int age;

public Animal(String nameValue, String breedValue, int ageValue){
    this.name = nameValue;
    this.breed = breedValue;
    this.age = ageValue;
}

    public String getName() {
        return this.name;
    }
    public String getBreed() {
        return this.breed;
    }
    public int getAge() {
        return this.age;
    }

    public abstract void eat();
}
