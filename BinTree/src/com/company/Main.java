package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BinaryTree bt = new BinaryTree();
        Node root =bt.BinTree();


    }
}



public class BinaryTree {
    Scanner sc= new Scanner(System.in);
    private class Node{
        int val;
        Node right;
        Node left;

        public Node(int val){
            val=this.val;
        }
    }
    public Node BinTree(){
        Node root =null;
        System.out.println("Enter the value");
        int data = sc.nextInt();

        if(data==-1){
            return null;
        }

        root = new Node(data);


        System.out.println("Enter the data for left ");
        root.left= BinTree();

        System.out.println("Enter the data for right");
        root.right=BinTree();

        return root;

    }

    public void inOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    public void preOrder(Node root){
        if(root==null) return;

        System.out.println(root.val);
        inOrder(root.left);
        inOrder(root.right);
    }

    public void postOrder(Node root){
        if(root==null) return;

        inOrder(root.left);
        inOrder(root.right);
        System.out.println(root.val);
    }
}