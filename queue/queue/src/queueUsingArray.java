import java.sql.SQLOutput;

public class queueUsingArray {
    int front , rear;
    int max_size;
    int queue[];

    queueUsingArray(int a){
        max_size=a;
        queue= new int[max_size];
        front=0;
        rear=0;
    }

    public void queueEnqeue(int elem){
        if(max_size==rear){
            System.out.println("queue is full no more elements can be entered");
        }
        else {
            queue[rear] = elem;
            rear++;
        }
    }

    public void deleteElem(){
        if(rear==front){
            System.out.println("the queue is empty ");
        }
        else{
           for(int i = 0 ; i < rear -1 ;i++){
               queue[i]=queue[i+1];
           }
           rear--;
        }
    }

    public void peekElem(){
        System.out.println(queue[front]);
    }

    public void showElem(){
        for(int i=front;i< rear;i++){
            System.out.print(queue[i]+"<--");
        }
    }

}
