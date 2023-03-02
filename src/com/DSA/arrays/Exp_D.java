package com.DSA.arrays;

import java.util.Arrays;

public class Exp_D {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.print(Arrays.toString(rotateArray(arr)));
    }

    public static int[] rotateArray(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;

        return arr;
    }

}
