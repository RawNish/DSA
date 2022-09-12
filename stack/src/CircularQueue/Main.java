package CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        cq.push(20);
        cq.push(30);
        cq.push(40);
        cq.push(50);
        cq.push(60);
        cq.display();
        cq.deque();
        cq.display();
    }



}
