package com.MAG.accessmodifiers.peopleevidence;

public class Person {
    public String name;
    protected int age;
    char gen;
    private final long IDNP;
    public boolean isRetired;

    public Person(String name, int age, long IDNP){
        this.name = name;
        this.age = age;
        this.IDNP = IDNP;
    }

    public Person(String name, int age, char gen, long IDNP, boolean isRetired){
        this.name = name;
        this.age = age;
        this.gen = gen;
        this.IDNP = IDNP;
        this.isRetired = isRetired;
    }

}
