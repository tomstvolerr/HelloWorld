package com.ildar.idea;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("Введите 1-е число");
        Scanner scannerA = new Scanner(System.in);
        int A = scannerA.nextInt();
        System.out.println("Введите 2-е число");
        Scanner scannerB = new Scanner(System.in);
        int B = scannerB.nextInt();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’");
        Scanner scannerC = new Scanner(System.in);
        String C = scannerC.next();
        if ("+".equals(C)) {
            System.out.println(A + B);
        }
        if ("-".equals(C)) {
            System.out.println(A - B);
        }
        if ("*".equals(C)) {
            System.out.println(A * B);
        }
        if ("/".equals(C)) {
            System.out.println(A / B);
        }
    }
}
