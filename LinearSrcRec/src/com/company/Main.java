package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int[] arr=  new int[5];
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<5;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key element");
    int key = sc.nextInt();
        System.out.println(linsrc(arr,key,0));

    }
    static boolean linsrc(int arr[], int key,int index){
        if(index>arr.length){
            return false;
        }

        else if(arr[index]==key){
            return true;
        }
        else{
            return linsrc(arr,key,index+1);
        }
    }
}
