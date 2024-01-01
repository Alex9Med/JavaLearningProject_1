package com.MAG.variablesprogramme;

public class VariablesAndComments {
    public static void main(String[] args){
        // Declare the variables

        // Truth based variables
        // Boolean data type, which can store true or false values.
        boolean isNew;
        boolean isApple;
        boolean is13;
        boolean isFullBattery;


        // Char related
        // Char can hold any character, such as a letter, a digit, or a special symbol, from the Unicode character set. Stores a single character/letter or ASCII values.
        char condition;
        char currency;


        // Numeric-related
        // Bytes can hold values from -128 to 127.
        byte numberOfSimCards;
        byte randomAccessMemory;
        byte megaPixels;
        // It has a minimum value of -32,768 and a maximum value of 32,767 (inclusive).
        short productionYear;
        // Stores whole numbers from -2,147,483,648 to 2,147,483,647.
        int numberOfOwners;
        int capacity;
        // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
        long id;
        // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits.
        float operatingSystemVersion;
        // Stores fractional numbers. Sufficient for storing 15 decimal digits.
        double price;


        //Initialize an iPhone
        isNew = true;
        isApple = true;
        is13 = true;
        isFullBattery = false;
        condition = 'A';
        currency = '$';
        numberOfSimCards = 1;
        randomAccessMemory = 8;
        megaPixels = 12;
        productionYear = 2022;
        numberOfOwners = 1;
        capacity = 128;
        id = 124424367996151L;
        operatingSystemVersion = 16.16F;
        price = 1099.99;

        System.out.println("The phone is new                 -->  " + isNew);
        System.out.println("The phone is Apple               -->  " + isApple);
        System.out.println("This is iPhone 13                -->  " + is13);
        System.out.println("This phone is charged            -->  " + isFullBattery);
        System.out.println("Condition of phone               -->  " + condition);
        System.out.println("In what currency was it bought   -->  " + currency);
        System.out.println("SimCards                         -->  " + numberOfSimCards);
        System.out.println("RAM                              -->  " + randomAccessMemory);
        System.out.println("MP Photography                   -->  " + megaPixels);
        System.out.println("Year of Production               -->  " + productionYear);
        System.out.println("Owners                           -->  " + numberOfOwners);
        System.out.println("Capacity                         -->  " + capacity);
        System.out.println("ID                               -->  " + id);
        System.out.println("Operating System Version         -->  " + operatingSystemVersion);
        System.out.println("Price                            -->  " + price);

    }
}
