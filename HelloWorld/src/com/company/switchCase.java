package com.company;

import java.util.Scanner;

public class switchCase {


    public static void main(String[] args) {
//        int marks ;
//        Scanner sc=  new Scanner(System.in);
//        marks = sc.nextInt();
//        boolean res = armStrong(marks);
//        System.out.println(res);
        for(int i = 0 ;i < 1000;i++){
            if(armStrong(i)){
                System.out.println(i);
            }
        }
    }
    static boolean armStrong (int num){
        int sum =0;
        int num1= num;
        while(num>0){
          int marks= num %10;
          sum = sum + marks*marks*marks;
          num = num/10;
        }
//
        if(sum==num1){
            return true;
        }
        else{
            return false;
        }
    }
}
