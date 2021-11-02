package com.ildar.idea;

public class Zadanie3 {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        int length = myArray.length;
        swap(myArray,0,2);
        System.out.println(myArray[0] + myArray[2]);
        System.out.println(myArray[length/2] + myArray[length-1]);
    }


    public static void swap(int[] myArray, int from, int to) {
        int tmp = myArray[from];
        myArray[from] = myArray[to];
        myArray[to] = tmp;
    }
}
