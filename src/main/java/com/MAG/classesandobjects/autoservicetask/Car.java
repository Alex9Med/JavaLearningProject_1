package com.MAG.classesandobjects.autoservicetask;

public class Car {
    public String mark;
    public int vinCode;
    public Person owner;

    public Car(String markInput, int vinCode, Person owner){
        mark = markInput;
        this.vinCode = vinCode;
        this.owner = owner;
        System.out.println("Acum in autoservice se afla automobilul de marca: " + mark);
    }
}
