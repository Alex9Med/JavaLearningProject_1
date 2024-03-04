package com.MAG.zooclubservice2;

public class ZooService {
    public static void main(String[] args) {

        System.out.println();

        Animal cat1 = new Cat("Molly", "Maine Coon |", 2, true);
        System.out.println(cat1.getName() + " | " + "Breed: " + cat1.getBreed() + " Age: "+ cat1.getAge() + " | " + "Has owner: " + true);
        // HasOwner nu putem apela din cauza ca am creat un obiect de tip Animal, unde nu avem getter pentru hasOwner.
        cat1.eat();
        cat1.makeSound();

        System.out.println();

        Cat cat2 = new Cat("Poppy", "Persian", 1, false);
        System.out.println(cat2.getName() + " | " + "Breed: " + cat2.getBreed() + " | " +"Age: "+ cat2.getAge() + " | " + "Has owner: " + cat2.getHasOwner());
        // In cazul dat deja putem printa HasOwner, deoarece in clasa Cat avem getter-ul.
        cat2.eat();
        cat2.makeSound();

        System.out.println();

        Animal dog1 = new Dog("Max", "Akita", 3, false);
        System.out.println(dog1.getName() + " | " + "Breed: " + dog1.getBreed() + " | " +"Age: "+ dog1.getAge() + " | " + "Has strap: ");
        dog1.eat();
        dog1.makeSound();

        System.out.println();

        Dog dog2 = new Dog("Cooper", "Belgian Malinois", 5, true);
        System.out.println(dog2.getName() + " | " + "Breed: " + dog2.getBreed() + " | " +"Age: "+ dog2.getAge() + " | " + "Has strap: " + dog2.isHasStrap());
        dog2.eat();
        dog2.makeSound();

        System.out.println();

        Animal horse1 = new Horse("Thunderbolt", "Arabian Horse", 7, true);
        System.out.println(horse1.getName() + " | " + "Breed: " + horse1.getBreed() + " | " +"Age: "+ horse1.getAge() + " | " + "Has saddle: " + true);
        horse1.eat();
        horse1.makeSound();

        System.out.println();

        Horse horse2 = new Horse("Sapphire", "Haflinger Horse", 10, false);
        System.out.println(horse2.getName() + " | " + "Breed: " + horse2.getBreed() + " | " +"Age: "+ horse2.getAge() + " | " + "Has saddle: " + horse2.isSaddle());
        horse2.eat();
        horse2.makeSound();
    }
}
