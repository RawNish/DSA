package PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {


    public static void main(String[] args) {
        PriorityQueue<Integer> num = new PriorityQueue<>(Collections.reverseOrder());
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);
        num.add(70);
        num.add(80);
        num.add(90);
        int x =3;
        int pos = num.size()-1;
        while(x!=1) {
            num.poll();
            pos--;
            x--;
        }
        System.out.println(num.peek());
    }
}
