package com.ghj.sort;

public class Insert_sort {
    public static void insert_sort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i+1; j > 0; j--){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                    swap(arr, i, minIndex);
                }
            }

        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
