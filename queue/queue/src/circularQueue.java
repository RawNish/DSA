public class circularQueue {
    int front, rear;
    int max_size;
    int queue[];

    circularQueue(int a) {
        max_size = a;
        queue = new int[max_size];
        front = -1;
        rear = -1;
    }

    void addElem(int a) {
        if ((rear + 1) % max_size == 0) {
            System.out.println("the queue is full");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = ((rear + 1) % max_size);
            queue[rear] = a;
        }
    }

    void deleteElem() {
        if (front == -1) {
            System.out.println("the queue is empty");
        }
        else{
            if(front==rear){
                rear=-1;
                front=-1;
            }
            else{
                front= (front+1)%max_size;
            }
        }

    }


    void displayElem(){
        if (front == -1) {
            System.out.println("the queue is empty");
        }
        else{
            for(int i = front ; i < rear;i++){
                System.out.println(queue[i]);
            }
        }
    }
}


