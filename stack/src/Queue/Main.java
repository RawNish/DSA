package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//import java.util.Stack
public class Main {
    public static void main(String[] args) {
//        Queue qq=  new Queue();
//        qq.enqueue(20);
//        qq.enqueue(30);
//        qq.enqueue(40);
//        qq.enqueue(60);
//        qq.enqueue(80);
//        qq.enqueue(90);
//        qq.enqueue(100);
//        qq.enqueue(90);
//        qq.enqueue(1000);
//        qq.enqueue(200);
        Queue<Integer> pq = new LinkedList<Integer>();
        pq.add(2);
        pq.add(3);
        pq.add(5);
        pq.add(6);
        Stack<Integer> st= new Stack<>();
        System.out.println(pq.remove());
        st.push(50);
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(50);
        ll.add(8);
        ll.add(2,7);
        System.out.println(ll);
//        qq.show();
//        qq.dequeue();
//        qq.dequeue();
//        qq.show();
    }
}
