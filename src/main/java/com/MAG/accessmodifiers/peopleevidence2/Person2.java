package com.MAG.accessmodifiers.peopleevidence2;

public class Person2 {
    public boolean isRetired;
    protected String name;
    int age;
    private long idnp;

    public Person2(){
        System.out.println("     This is a defined constructor without params");
    }

    public Person2(String name, int ageInput){
        this.name = name;
        age = ageInput;
        System.out.println("     This is a defined constructor with 2 params");
    }

    public Person2(boolean isRetired, String name, int age, long idnp){
        this.isRetired = isRetired;
        this.name = name;
        this.age = age;
        this.idnp = idnp;
        System.out.println("     This is a defined constructor with all params");
    }
}
