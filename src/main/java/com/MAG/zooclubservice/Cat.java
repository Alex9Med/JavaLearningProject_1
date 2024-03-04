package com.MAG.zooclubservice;

public class Cat extends Animal {

    private boolean hasAGoodLife;
    public Cat (String name, boolean hasAGoodLife){
        super (name);
        this.hasAGoodLife = hasAGoodLife;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    @Override
    public void eat() {
        System.out.println("A cat is eating Whiskas");
    }
}
