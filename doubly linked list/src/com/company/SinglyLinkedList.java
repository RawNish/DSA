package com.company;

public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    SinglyLinkedList(){
        head=null;
        tail=null;
        size=0;
    }

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public void insertAtBegining(int val){
            Node temp = new Node(val);
            temp.next=head;

            head=temp;

            if(tail==null){
                tail=head;
            }

            size+=1;
        }

        public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + "-");
            temp= temp.next;
        }

        }

        public void addAtEnd(int val){
        Node node = new Node(val);
        Node temp= head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        }

        public void insertAtPos(int val,int pos){
        Node node= new Node(val);
        Node temp = head;
        while(pos-2!=0){
            temp=temp.next;
            pos--;
        }

        node.next= temp.next;
        temp.next=node;
        }

        public void deleteElement(int pos){
//        Node node = new Node(val);
            if(head==tail){
                return;
            }
        Node temp = head;
        while(pos-2!=0 && temp!=null){
            temp=temp.next;
        }
        temp.next=temp.next.next;

        }


}
