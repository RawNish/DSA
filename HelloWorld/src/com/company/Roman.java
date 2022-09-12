package com.company;

public class Roman {
    public  static void main(String[] args){
        String s = "MIV";
        int ans = romanNumeral(s);
        System.out.println(ans);
    }
    static int romanNumeral(String s){
        int number  = 0;
        for(int i = s.length()-1 ;i>0;){
            if(s.charAt(i)=='I'){
                number+=1;
            }
            if(s.charAt(i)=='V'){
                if(s.charAt(i-1)=='I'){
                    number+=4;
                    i-=2;
                }
                else{
                    number+=5;
                    i--;
                }
            }
            if(s.charAt(i)=='X'){
                if(s.charAt(i-1)=='I'){
                    number+=9;
                    i-=2;
                }
                else{
                    number+=5;
                    i--;
                }
            }


        }

        return number;
    }
}
