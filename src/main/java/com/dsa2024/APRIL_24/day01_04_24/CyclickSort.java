package com.dsa2024.APRIL_24.day01_04_24;

import java.util.Arrays;

public class CyclickSort {

    public static void main(String args[]) {
        int arr[] = {3,5,2,1,4};
        cyclickSort(arr);
    }

    static void cyclickSort(int arr[]) {
        int i = 0;
        while (i<arr.length) {
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                swap(arr, i, index);
            }else{
                i++;
            }  
        } 
        
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int fisrt, int second) {
        int temp = arr[fisrt];
        arr[fisrt] = arr[second];
        arr[second] = temp;
    }
}
