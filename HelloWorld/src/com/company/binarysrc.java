package com.company;

import java.util.Scanner;

public class binarysrc {
    public static void main(String[] args) {
        int arr[] = {1,3,5,12,18,30,34,36,40};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        boolean result = binsrc(arr,key,0,arr.length-1);
        System.out.println(result);
    }
    static boolean binsrc(int[] arr, int key, int i, int length){
        int mid = (i + length)/2;
        {
            while (i >= length)
                if (arr[mid] == key) {
                    return true;
                } else if (arr[mid] > key) {
                    return binsrc(arr, key, 0, mid - 1);
                } else if (arr[mid] < key) {
                    return binsrc(arr, key, mid + 1, arr.length - 1);
                }
                }
                return false;
        }
    }

