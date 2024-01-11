package com.MAG.accessmodifiers;

import com.MAG.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
Person vasilePerson = new Person("Vasile", 20, 400200300007L);
vasilePerson.isRetired = false;
if (vasilePerson.isRetired) {
    System.out.println("Vasile este la pensie");
} else {
    System.out.println("Vasile nu este la pensie");
}


Person ionPerson = new Person("Ion", 72, 'M', 200410230008L, true);
if (ionPerson.isRetired) {
    System.out.println("Ion este la pensie");
} else {
    System.out.println("Ion nu este la pensie");
}

Person igorPerson = new Person("Igor", 31, 700400200005L);
igorPerson.isRetired = false;
if (igorPerson.isRetired) {
    System.out.println("Igor este la pensie");
} else {
    System.out.println("Igor nu este la pensie");
}


Person elenaPerson = new Person("Elena", 40, 800400500003L);
elenaPerson.isRetired = false;
if (elenaPerson.isRetired) {
    System.out.println("Elena este la pensie");
} else {
    System.out.println("Elena nu este la pensie");
}


Person anaPerson = new Person("Ana", 75, 'F', 500600100001L, true);
if (anaPerson.isRetired) {
    System.out.println("Ana este la pensie");
} else {
    System.out.println("Ana nu este la pensie");
}

    }
}
