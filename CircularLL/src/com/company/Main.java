package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	   int[] arr = new int[5];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        boolean ans = sortedarr(arr,0);
        System.out.println(ans);
        }


    static boolean sortedarr(int arr[],int index){
        if(index==arr.length-1){
            return true;
        }
        return((arr[index]<arr[index+1])&& sortedarr(arr,index+1));
    }
}
