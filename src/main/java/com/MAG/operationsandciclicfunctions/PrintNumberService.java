package com.MAG.operationsandciclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int min = 1;
        int max = 1001;

        // Number % 2 == 0. Numere pare
        for (int i = min; i <= max; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Number % 2 != 0 or Number % 2 == 1. Numere impare
        int i = min;
        while (i < max) {
            if (i % 2 != 0){
                System.out.println(i);
            }
//            i++;
//            i += 1;
            i = i + 1;
        }

        int b = max;
        do {
            if (b % 2 == 1) {
                System.out.println(b);
            }
            b--;
        } while (b >= min);
    }

}
