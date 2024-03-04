package com.MAG.zooclubservice;

public class ZooService {
    public static void main(String[] args) {
        Animal chappieDog = new Dog("Chappie", true);
        System.out.println(chappieDog.getName());
        chappieDog.eat();
        chappieDog.makeSound();

        Dog rexDog = new Dog("Rex", false);
        System.out.println(rexDog.getName());

        Cat ciceroCat = new Cat("Cicero", false);
        System.out.println(ciceroCat.getName());
        ciceroCat.eat();
        ciceroCat.makeSound();


    }

}
