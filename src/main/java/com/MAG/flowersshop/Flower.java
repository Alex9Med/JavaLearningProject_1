package com.MAG.flowersshop;

public class Flower extends Plant{
    private String mainColor;

    public Flower (String name, String mainColor){
        super (name);
        this.mainColor = mainColor;
    }
    public String getMainColor(){
        return this.mainColor;
    }

    public void printFlowerDetails(){
        System.out.println("The flower name is: " + this.getName());
        System.out.println("The flower color is: " + this.mainColor);
    }
}
