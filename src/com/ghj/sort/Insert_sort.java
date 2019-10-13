package com.ghj.sort;

public class Insert_sort {
    public static void insert_sort(int[] arr){
        if (arr == null || arr.length < 2){
            for (int i = 0; i < arr.length - 1; i++){
                for (int j = i + 1; j > 0; j--){
                    if (arr[j-1] > arr[j]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] =  temp;
                    }else {
                        //不要交换
                        break;
                    }
                }
            }
        }
    }
}
