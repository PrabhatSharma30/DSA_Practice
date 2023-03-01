package com.DSA.arrays;

public class Exp_B {

    static class Pair {
        int min;
        int max;
    }

    public static Pair getMinMax(int[] arr, int n){
        Pair pair = new Pair();
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<n; i++){
            int temp = arr[i];
            if (max < temp){
                max = temp;
            }

            if(min > temp){
                min = temp;
            }
        }
        pair.min = min;
        pair.max= max;

        return pair;
    }

    public static void main(String[] args) {
        int[] arr = {1000, 11, 445, 1, 330, 3000};
        int n = arr.length;

        Pair val = getMinMax(arr, n);
        System.out.println("Min value: " + val.min + ", and Max value: " + val.max);
    }

}
