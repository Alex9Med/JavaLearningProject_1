package com.MAG.flowersshop;

public class ExecutionService {
    public static void main(String[] args) {
        Rose rose1 = new Rose("Hermosa","Pink");
/*
        String result = rose1.getName();
        System.out.println(result);
        In loc de codul de mai sus putem folosi metoda printRoseName, economisim spatiu...
*/
        Rose rose2 = new Rose("Black Ice","Black");

        rose1.printFlowerDetails();

        System.out.println();

        rose2.printFlowerDetails();

        System.out.println();

        Daisy daisy1 = new Daisy("Arctotis", "White and Yellow");
        daisy1.printFlowerDetails();

        System.out.println();

        Tulip tulip1 = new Tulip("Red", "Darwin Hybrid");
        tulip1.printFlowerDetails();

    }
}
