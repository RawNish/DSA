package com.company;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,6,5};
        insertSortFun(arr);
    }

    private static void insertSortFun(int[] arr) {

        for(int i = 1 ;i <arr.length;i++ ){
                int key = arr[i];
                int j = i-1;
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
            }
        System.out.println(Arrays.toString(arr));
        }

    }

