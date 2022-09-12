package com.company;

public class doublyLinkedList {
    private Node head;
    private Node tail;

    private int size;

    doublyLinkedList(){
        size=0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head==null){
            head=tail=node;
            head.prev=null;
            tail.next=null;
        }

        else{
            head.prev=node;
            node.next=head;
            node.prev=null;
            head=node;
        }
        size=+1;
    }

    public void display(){
        Node temp=head;
        System.out.print("start-> ");
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.next;
        }
        System.out.print(" end");
    }
    public void reversePrint(){
        Node temp=tail;
        System.out.println(" ");
        System.out.print("end-> ");
        while(temp!=null){
            System.out.print(temp.data +" -> ");
            temp=temp.prev;
        }
        System.out.print(" start ");


    }
    public void insertatPos(int data,int pos){
        Node node = new Node(data);
        Node temp =head;
        while(pos>=2){
            temp=temp.next;
            pos--;
        }
        temp.prev.next=node;
        node.prev=temp.prev;
        node.next=temp;
        temp.prev=node;
        size=+1;

    }

    private class Node{
        private int data;
        private Node next;
        private Node prev;


        Node(int data){
            this.data=data;
        }
        Node(int data , Node prev ,Node next){
            this.data=data;
            this.prev=prev;
            this.next=next;
        }
    }




}
