package com.company;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        cyclicSortFun(arr);
    }

    private static void cyclicSortFun(int[] arr) {
        for(int i = 0 ; i<arr.length ;){
            int correct = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }


        }
//        System.out.println(Arrays.toString(arr));
        int i= 0;
        for( ; i<arr.length-1; i++ ){
            if(arr[i]!=i){
                break;
            }

        }
        System.out.println(arr[i]-1);
    }
    static void swap(int arr[], int i , int correct ){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }

}
