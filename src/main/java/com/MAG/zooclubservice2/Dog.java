package com.MAG.zooclubservice2;

public class Dog extends Animal implements AnimalInterface{
    private boolean hasStrap;

    public Dog (String name, String breed, int age, boolean hasStrapValue){
        super(name, breed, age);
        this.hasStrap = hasStrapValue;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Pedigree");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + getName() + " says: Woof!");
    }


    public boolean isHasStrap() {
        return hasStrap;
    }
}
