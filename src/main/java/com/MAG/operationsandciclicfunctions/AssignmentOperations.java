package com.MAG.operationsandciclicfunctions;

public class AssignmentOperations {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        System.out.println(b);

        a %= b;
        System.out.println(a);
    }
}
