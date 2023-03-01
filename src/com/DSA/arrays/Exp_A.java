package com.DSA.arrays;

public class Exp_A {

    public static void main(String[] args) {

        int[] arr = {1,2,3,5,6,7,10};
        int n = arr.length;

        for(int i=0; i<n; i++){
            if(i < n / 2){
                int temp = arr[i];
                arr[i] = arr[(n-1)-i];
                arr[(n-1)-i] = temp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

}
