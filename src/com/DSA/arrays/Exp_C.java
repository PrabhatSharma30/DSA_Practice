package com.DSA.arrays;

public class Exp_C {

    public static int[] rearrange(int[] arr, int n) {
        int i = 0;
        while (i < n) {
            if (arr[i] < 0 && i > 0 && arr[i - 1] > 0) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                i--;
                continue;
            }
            i++;
        }
        return arr;
    }

        public static void main (String[]args){
            int[] arr = {5,7,-4,10,-1,2};
            int n = arr.length;

            int[] newArray = rearrange(arr, n);
            for (int i: newArray) {
                System.out.print(i + " ");
            }
        }
}
