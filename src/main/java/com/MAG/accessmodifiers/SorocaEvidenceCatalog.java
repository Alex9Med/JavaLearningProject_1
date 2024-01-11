package com.MAG.accessmodifiers;

import com.MAG.accessmodifiers.peopleevidence2.Person2;

public class SorocaEvidenceCatalog {
    public static void main(String[] args) {
        Person2 Galina = new Person2();
        System.out.println(Galina.isRetired);
        /* Putem apela doar proprietatea isRetired, deoarece ea are modificatorul de acces public - poate fi apelata de oriunde in proiect.
        La executie va da valoarea false(valoare default pentru un tip de date boolean), pentru ca nu i-am atribuit nici-o valoare.
        Proprietății name îi este atribuit modificatorul de acces protected, deci poate fi apelată in interiorul +clasei, +pachetului in care se afla clasa, +subclasa pachetului exterior(adica extinderea clasei, in cazul nostru noi nu extindem).
        Proprietatii age ii este atribuit modificatorul de acces default - poate fi apelat in interiorul clasei si a pachetului peopleevidence2(clasa SorocaEvidenceCatalog se afla in pachetul accessmodifiers).
        Proprietatea idnp are modificatorul de acces private si poate fi apelat doar in interiorul clasei Person2 din pachetul peopleevidence2.
         */
        Galina.isRetired = true;
        if (Galina.isRetired){
            System.out.println("Galina este la pensie");
        } else {
            System.out.println("Galian nu este la pensie");
        }

        Person2 Victor = new Person2("Victor", 40);
        Victor.isRetired = false;
        if (Victor.isRetired){
            System.out.println("Victor este la pensie");
        } else {
            System.out.println("Victor nu este la pensie");
        }

        Person2 Angela = new Person2(true, "Angela", 67, 4506501203333L);
        // isRetired - parametru formal, name - parametru formal, etc. True - parametru actual, Angela - parametru actual, etc.
        System.out.println(Angela.isRetired); // Putem apela doar proprietatea isRetired fiindca este publica, restul au alti modificatori de acces care nu permit apelarea lor in clasa data.
    }
}
