package com.company;

import java.util.ArrayList;
import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        int arr [] ={2,7,11,15};
        int target = 9;
        int arr2[] = call(arr,target);
        System.out.println(Arrays.toString(arr2));
    }
    static int[] call(int arr[] ,int target){
        int p1 = arr.length-1;
        int p2 =0;
        while(p1>p2){
            if(arr[p1]+arr[p2]>target) {
                p1--;
            }
            else if(arr[p1]+arr[p2]==target)
            {
                return new int[] {p1,p2};
            }
            else{
                p2++;
            }


        }
        return new int[] {};
    }
}