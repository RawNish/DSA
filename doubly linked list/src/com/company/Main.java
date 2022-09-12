package com.company;

public class Main {

    public static void main(String[] args) {
//	doublyLinkedList dll = new doublyLinkedList();
//    dll.insertFirst(20);
//    dll.insertFirst(30);
//    dll.insertFirst(40);
//    dll.insertFirst(50);
//    dll.display();
//    dll.reversePrint();
//    dll.insertatPos(60,2);
//    dll.display();

      SinglyLinkedList sl = new SinglyLinkedList();

      sl.insertAtBegining(25);
      sl.insertAtBegining(20);
      sl.insertAtBegining(32);
      sl.insertAtBegining(65);
//      sl.display();
      sl.addAtEnd(85);
      sl.addAtEnd(7);
      sl.addAtEnd(12);
//      sl.display();
      sl.insertAtPos(33,3);
//      sl.display();
      sl.deleteElement(3);
//      sl.display();
    }
}
