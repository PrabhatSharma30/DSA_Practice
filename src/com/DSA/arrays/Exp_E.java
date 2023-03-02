package com.DSA.arrays;

import java.util.*;

public class Exp_E {

    public static void main(String[] args) {
        int[] a = { 1, 2, 5, 6, 2, 3, 5, 7, 3, 9 };
        int[] b = { 2, 4, 5, 6, 8, 9, 4, 6, 5, 4 };

        System.out.println(Arrays.toString(getUnion(a, b)));
        System.out.println(Arrays.toString(getIntersection(a, a.length, b, b.length)));
    }

    public static Integer[] getIntersection(int[] a,int n, int[] b, int m) {
        int i = 0, j = 0;
        Set<Integer> set = new HashSet<>();

        while (i < n && j < m) {

            if (a[i] > b[j]) {
                j++;
            }

            else if (b[j] > a[i]) {
                i++;
            }
            else {
                set.add(a[i]);
                i++;
                j++;
            }
        }
        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);

        return arr;
    }

    public static Integer[] getUnion(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();

        for (int i : a) {
            set.add(i);
        }
        for (int i : b) {
            set.add(i);
        }
        Integer[] arr = new Integer[set.size()];
        set.toArray(arr);

        return arr;
    }
}
