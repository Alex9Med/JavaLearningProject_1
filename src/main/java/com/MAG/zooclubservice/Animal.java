package com.MAG.zooclubservice;

public abstract class Animal implements AnimalInterface{
    protected String name;
    public Animal (String nameValue){
        this.name = nameValue;
    }

    public String getName(){
        return this.name;
    }

    public abstract void eat();
}
