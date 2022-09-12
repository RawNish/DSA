package com.company;


import java.text.BreakIterator;
import java.util.Scanner;

class Main
{
    static int calcEmptybucket(int N, int arr[]){
        int count = 0;
        for(int  i = 0; i < arr.length ; i++){
            switch(arr[i]){
                case 1 :
                   count = N;
                   break;
                case (2) :
                        count = count - N/2;
                    break;

                case 3 :
                    count = count  - (N+1)/2;
                    break;

                case 4 :
                    count = 0 ;
                    break;
            }

        } return count;

    }

    public static void main(String[] args) {
        int N;
        Scanner sc  = new Scanner(System.in);
        N = sc.nextInt();

        int n ;
        n = sc.nextInt();
        int[] array = new int[5];
        for(int i = 0 ;i < n ; i++){
            array[i] = sc.nextInt();
        }

        int count   =  calcEmptybucket(N,array);
        System.out.println(count);
    }
}