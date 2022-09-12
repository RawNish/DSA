package Queue;

import java.util.Arrays;

public class Queue {
    private int[] arr = new int[10];
    private int tail;
    private int head;

    Queue(){
        head=tail=0;
    }
    public void enqueue(int val){
        if(tail==10){
            System.out.println("queue is full");
            return;
        }
        arr[tail]=val;
        tail++;
        return ;
    }
    public void show(){
        System.out.println(Arrays.toString(arr));
    }
    public void dequeue(){
        if(head==tail){
            System.out.println("queue undeeflow");
            return;
        }
        for(int i=0;i<tail-1;i++){
            arr[i]=arr[i+1];
        }
        arr[tail-1]=0;
        tail--;
    }

}
