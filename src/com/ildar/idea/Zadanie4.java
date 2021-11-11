package com.ildar.idea;

import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("Введите значение x");
        Scanner scannerX = new Scanner(System.in);
        int numberX = scannerX.nextInt();
        System.out.println("Введите значение y");
        Scanner scannerY = new Scanner(System.in);
        int numberY = scannerY.nextInt();
        System.out.println("Введите значение z");
        Scanner scannerZ = new Scanner(System.in);
        int numberZ = scannerZ.nextInt();
        int sarph = (numberX + numberY + numberZ) / 3;
        System.out.println(sarph);
        int A = sarph / 2;
        int B = (int) Math.floor(A);
        if(B > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
