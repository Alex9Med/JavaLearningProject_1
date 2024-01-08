package com.MAG.classesandobjects;

import com.MAG.classesandobjects.autoservicetask.Car;
import com.MAG.classesandobjects.autoservicetask.Garage;
import com.MAG.classesandobjects.autoservicetask.Person;
import com.MAG.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {
    public static void main(String[] args) {
        Garage detailGarage;
        detailGarage = new Garage();
        detailGarage.address = "Strada Uzinelor 210/2, Chișinău, Moldova";
        detailGarage.surfaceM2 = 550.00F;
        detailGarage.capacity = 10;
        System.out.println("Obiectul detailGarage are urmatoarele proprietati: " + " Adresa --> " + detailGarage.address + "       Suprafata --> " + detailGarage.surfaceM2 + "       Capacitatea --> " + detailGarage.capacity);


        Garage autoDoc = new Garage();
        autoDoc.address = "Strada Calea Ieşilor 14/3, Chișinău, Moldova";
        autoDoc.surfaceM2 = 200.00F;
        autoDoc.capacity = 5;
        System.out.println("Obiectul autoDoc are urmatoarele proprietati: " + " Adresa --> " + autoDoc.address + "       Suprafata --> " + autoDoc.surfaceM2 + "       Capacitatea --> " + autoDoc.capacity);


        Worker alex = new Worker();
        alex.name = "Alex";
        alex.age = 22;
        alex.phone = 37360142536L;
        System.out.println("Obiectul nostru are numele de: " + alex.name + "    Varsta: " + alex.age + "   Tel:" + alex.phone);

        Worker nicu = new Worker();
        System.out.println("Obiectul nostru are numele de: " + nicu.name + "    Varsta: " + nicu.age + "   Tel:" + nicu.phone);


        Person client1 = new Person("Vasile", 37368153426L);

        Person clientX = new Person();

        Car mercedesPNP878 = new Car("Mercedes S-class", 215463478, client1);
        Car renaultMZM123 = new Car("Renault Scenic", 165498498,
                new Person("Kolea", 373147258));
        Car teslaXOX000 = new Car("Tesla CyberTruck", 154849168, clientX);
        System.out.println("Automobilul nostru este: " + mercedesPNP878.mark + "    Vin-Code: " + mercedesPNP878.vinCode + "   Proprietarul: " + mercedesPNP878.owner.name + " " + " Tel: " + mercedesPNP878.owner.phoneNumber);
        System.out.println("Automobilul nostru este: " + renaultMZM123.mark + "    Vin-Code: " + renaultMZM123.vinCode + "   Proprietarul: " + renaultMZM123.owner.name + " " + " Tel: " + renaultMZM123.owner.phoneNumber);
        System.out.println("Automobilul nostru este: " + teslaXOX000.mark + "    Vin-Code: " + teslaXOX000.vinCode + "   Proprietarul: " + teslaXOX000.owner.name + " " + " Tel: " + teslaXOX000.owner.phoneNumber);
    }
}
