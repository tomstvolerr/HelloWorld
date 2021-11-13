package com.ildar.idea;

import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        System.out.println("Введите 1-е число");
        Scanner scannerA = new Scanner(System.in);
        double chislo1 = scannerA.nextInt();
        System.out.println("Введите 2-е число");
        Scanner scannerB = new Scanner(System.in);
        double chislo2 = scannerB.nextInt();
        System.out.println("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’");
        Scanner scannerC = new Scanner(System.in);
        String znakDeistviya = scannerC.next();
        if ("+".equals(znakDeistviya)) {
            System.out.println(chislo1 + chislo2);
        }
        if ("-".equals(znakDeistviya)) {
            System.out.println(chislo1 - chislo2);
        }
        if ("*".equals(znakDeistviya)) {
            System.out.println(chislo1 * chislo2);
        }
        if ("/".equals(znakDeistviya)) {
            System.out.println(chislo1 / chislo2);
        }
    }
}
