package com.MAG.zooclubservice2;

public class Horse extends Animal implements AnimalInterface{
    private boolean saddle;

    public Horse(String name, String breed, int age, boolean saddleValue){
        super(name, breed, age);
        this.saddle = saddleValue;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Hay");
    }

    @Override
    public void makeSound() {
        System.out.println("Horse " + getName() + " make snorting noises...");
    }

    public boolean isSaddle() {
        return saddle;
    }
}
