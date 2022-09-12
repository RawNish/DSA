package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class selectionSort {

    public static void main(String[] args) {
        int[] arr = {12,4,5,13,61,1};
        selectionSortFun(arr);
    }
    static void selectionSortFun(int[] arr){
        for(int  i = 0 ; i <arr.length-1;i++){
            int min =  i;
            for(int j =i+1;j<arr.length ; j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp =  arr[i];
            arr[i]=arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
