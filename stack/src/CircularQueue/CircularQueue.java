package CircularQueue;

public class CircularQueue {
private int tail=-1;
private int head=-1;
private int[] arr = new int[6];

public void push(int val){
    if(tail==arr.length-1){
        System.out.println("array is full");
    }
    if(head==-1){
        head=0;
    }
    tail= (tail+1)%6;
    arr[tail]=val;
    System.out.println("inserted " + val);
}
public void display(){
   if(head==tail){
       System.out.println("queue is empty");
   }

   for(int i=head;i<=tail;i=(i+1)%6){
       System.out.print(arr[i]+" -> ");
   }



}
public void deque(){
    if(head==tail){
        System.out.println("empty queue");
    }
    System.out.println("deleted element " +arr[head]);
    for(int i=0;i<tail;i++){
        arr[i]=arr[i+1];
    }
    arr[tail]=0;
    tail--;
}


}
