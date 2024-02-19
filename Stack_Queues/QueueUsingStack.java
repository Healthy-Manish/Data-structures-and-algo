package Stack_Queues;

public class QueueUsingStack {
    int n=5;
    int cnt =0;
    int rear = 0;
    int front = 0;
    int[] arr=new int[n];
    void push(int x){
        if(cnt<n){
            arr[rear%n]=x;
            rear++;
            cnt++;
        }
        else{
            System.out.println("Queue is full");
        }
    }
    void peek() {
        if (cnt==0)return;
        System.out.println( arr[front%n]);

    }
    int pop(){
        if (cnt==0)return -1;
        cnt--;
        int var = arr[front%n];
        front++;
        return var;
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();

        queue.push(2);
        queue.push(7);
        queue.push(9);
        queue.peek();
        queue.pop();
        queue.peek();
        queue.push(1);
        queue.push(12);
        queue.push(13);
        queue.pop();
        queue.peek();
    }
}
