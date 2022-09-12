package com.company;

public class Stack {
    private int stack[] = new int[5];
    private int top;
    Stack(){
        top=-1;
    }
    public void push(int val){
        if(top>5){
            System.out.println("Stack overlfow");
        }
    stack[++top]=val;
    }
    public void display(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        }
    }
    public void pop(){
        if(top<0){
            System.out.println("stack underflow");
        }
        System.out.println("the element "+ stack[top]+" @ "+" position "+top+" has been removed");
        top--;
    }
}
