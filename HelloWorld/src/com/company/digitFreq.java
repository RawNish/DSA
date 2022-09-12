package com.company;

import java.util.Scanner;

public class digitFreq {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2= sc.nextInt();
        int ans = digitFrequencyCount(num,num2);
        System.out.println(ans);
    }
    public static int digitFrequencyCount(int num,int num2){
        int count = 0;
        while(num!=0){
            int rem = num % 10;
            if(rem==num2){
                count++;
            }
            num = num /10;
        }
        return count;
    }
}
