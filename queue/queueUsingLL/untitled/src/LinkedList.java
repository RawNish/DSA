public class LinkedList {

    private Node head;
    private Node tail;

    private class Node{
         int data;
         Node next;
         Node(int data){
             this.data=data;
             this.next=null;
         }
     }

     public void addElem(int val){
        Node temp= new Node(val);
        if(head==null || tail==null){
            head=temp;
            tail=temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
     }

     public void removeElem(){
        Node pp =head;

        while(pp.next!=tail){
            pp=pp.next;
        }
        tail=pp;
     }

     public void display(){
        Node pp =head;
        while(pp!=tail.next){
            System.out.print(pp.data+"<-");

            pp=pp.next;
        }
         System.out.println();
     }

}
