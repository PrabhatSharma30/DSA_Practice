package com.DSA.arrays;

import java.util.Scanner;

public class A_Exp {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<10; i++) {
            arr[i] = i;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}
