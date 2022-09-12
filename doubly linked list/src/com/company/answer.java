package com.company;

import java.util.ArrayList;

public class answer {
    public static void main(String[] args) {
        ArrayList<Integer>  A = new ArrayList<Integer>();
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(2);
        int ans = answerFined(A);
    }
    public static int answerFined(ArrayList<Integer> A){
        int flag = 0;
        int count = 1 ;
        for(int i = 1 ; i< A.size(); i++){
            for(int j =0 ; j < i ; j++){
                if(A.get(j)>A.get(i) || A.get(j)==A.get(i) ){
                    flag=1;
                }
            }
            if(flag==0){
                count++;
            }
        }
        return count;
    }
}
