package com.MAG.flowersshop;

public class Rose extends Flower {
    public void printRoseName(){
        System.out.println(this.getName());
    }

    public Rose(String name, String color){
        super(name, color);
    }
}
