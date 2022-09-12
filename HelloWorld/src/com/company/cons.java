package com.company;

import java.util.Scanner;

public class cons {
    public static void main(String[] args){
        int x = -121;
        boolean ans = revFinder(x);
        System.out.println(ans);
    }
    static boolean revFinder(int x){
        if (x < 0){
            return false;
        }
        int num = x;
        int rev = 0;
        while(num!=0){
            int remainder = num %10;
            rev= rev * 10 +remainder;
            num= num/10;
        }
        if(x==rev){
            return true ;
        }
        else{
            return false;
        }

    }
}