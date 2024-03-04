package com.MAG.zooclubservice2;

public class Cat extends Animal implements AnimalInterface {
    private boolean hasOwner;
    public Cat (String name, String breed, int age, boolean hasOwnerValue){
        super(name, breed, age);
        this.hasOwner = hasOwnerValue;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating Whiskas");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + getName() + " says: Meow!");
    }

    public boolean getHasOwner() {
        return hasOwner;
    }
}
