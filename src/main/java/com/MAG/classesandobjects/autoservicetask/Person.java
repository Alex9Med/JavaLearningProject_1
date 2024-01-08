package com.MAG.classesandobjects.autoservicetask;

public class Person {
    public String name;
    public long phoneNumber;
    public Person(String nameOfTheClient, long phoneNumberOfTheClient){
        name = nameOfTheClient;
        phoneNumber = phoneNumberOfTheClient;
    }

    public Person(){
        name = "Dorin";
        phoneNumber = 37360000000L;
    }
}
