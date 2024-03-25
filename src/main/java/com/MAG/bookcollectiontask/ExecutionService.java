package com.MAG.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class ExecutionService {
    public static void main(String[] args) {
        Book book1 = new Book("Atomic Habits", "James Clear");
        Book book2 = new Book("Crime and Punishment", "Feodor Dostoievski");
        Book book3 = new Book ("The Brothers Karamazov", "Feodor Dostoievski");
        Book book4 = new Book ("Also Sprach Zarathustra", "Friedrich Nietzsche");
        Book book5 = new Book ("Forest of the Hanged", "Liviu Rebreanu");

        System.out.println();
        book1.printTheBookDetails();
        book2.printTheBookDetails();
        book3.printTheBookDetails();
        book4.printTheBookDetails();
        book5.printTheBookDetails();
        System.out.println();


        Library carturestiLibrary = new Library("Carturesti");
        carturestiLibrary.addBook(book1);
        carturestiLibrary.addBook(book1);
        carturestiLibrary.addBook(book2);
        carturestiLibrary.addBook(book3);

        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(book4));

        carturestiLibrary.addBook(book4);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(book4));

        carturestiLibrary.deleteABookIfExists(book4);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());

        carturestiLibrary.printAllTheBooks();


        System.out.println();


        Library cartierLibrary = new Library("Cartier");
        cartierLibrary.addBook(book4);
        cartierLibrary.addBook(book5);
        cartierLibrary.addBook(book2);
        System.out.println(cartierLibrary.getTheStockStatusNumber());
        cartierLibrary.printAllTheBooks();

        System.out.println();

        Map<String, Library> librariesMap = new HashMap<>();
        librariesMap.put("str. Alexandru cel Bun 145", carturestiLibrary);
        librariesMap.put("str. Vasile Lupu 2/5", cartierLibrary);

        librariesMap.get("str. Alexandru cel Bun 145").printAllTheBooks();
        System.out.println(librariesMap.get("str. Vasile Lupu 2/5").isThereSuchABookInTheStock(book5));

        System.out.println();


        int[] dataTable = new int[6];
        dataTable[0] = 9;
        dataTable[1] = 65;
        dataTable[2] = 12;
        dataTable[3] = 52;
        dataTable[4] = 5;
        dataTable[5] = 1;
        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));

        System.out.println();

        int[] dataTableShort = {12,2,47,31,20,1,2,87,3,41};
        System.out.println(IntNumberArrayService.findMin(dataTableShort));
        System.out.println(IntNumberArrayService.getAvg(dataTableShort));

    }
}
