package com.company;

import java.util.Arrays;
import java.util.StringJoiner;
public class Main{
    public static void main(String[]args){
      String s = new String("#HackerRank");
      int ans = minimumNumber(s.length()-1 ,s);
      System.out.println(ans);
    }


    public static int minimumNumber(int n, String password) {
        int caps= 0 ;
        int capsoff= 0 ;
        int num = 0 ;
        int spe = 0 ;

        // Return the minimum number of characters to make the password strong
        for(int i = 0 ; i < n ; i++){
            if(Character.isLowerCase(password.charAt(i))==true){
                caps=1;
            }
            if(Character.isDigit(password.charAt(i))==true){
                num=1;
            }
            if(Character.isUpperCase(password.charAt(i))==true ){
                capsoff=1;
            }
            //"!@#$%^&*()-+"
            if(password.charAt(i)=='!' || password.charAt(i)=='!'|| password.charAt(i)=='#' || password.charAt(i)=='$' || password.charAt(i)=='%' || password.charAt(i)=='^' ||password.charAt(i)=='&' || password.charAt(i)=='*' || password.charAt(i)==')' || password.charAt(i)=='(' || password.charAt(i)=='+' || password.charAt(i)=='-'){
                spe=1;
            }
        }


        if(n >= 6){
            return (4-(spe+ caps+capsoff + num));
        }
        else{
            return (6-n);
        }
    }

    }


