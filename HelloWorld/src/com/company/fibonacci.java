package com.company;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int ans = fibo(n);
        System.out.println(ans);
    }

    private static int fibo(int n) {
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else if(n==3){
            return 1;
        }
        else{
            return (fibo(n-1)+fibo(n-2));
        }
    }

}
