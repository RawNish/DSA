package com.company.subsequence;

import java.util.ArrayList;

public class Subseq {
    public static void main(String[] args) {
        ArrayList<String> str= new ArrayList<>();
        subset("","abc");
        str = subset2("","abc");
        System.out.println(str);
    }

    static void subset(String p ,String up){
    if(up.isEmpty()){
        System.out.println(p);
        return;
    }
    char ch= up.charAt(0);
    subset(p+ch,up.substring(1));
    subset(p,up.substring(1));

    }
    static ArrayList<String> subset2(String p , String up){
        ArrayList<String> str=  new ArrayList<>();
        if(up.isEmpty()){
            str.add(p);
            return str;
        }
        char ch= up.charAt(0);
        ArrayList<String> left =subset2(p+ch,up.substring(1));
        ArrayList<String> right =subset2(p,up.substring(1));
        left.addAll(right);
        return left;
    }


}
