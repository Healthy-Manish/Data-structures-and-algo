package Stack_Queues;

public class StackUsingArray {
            int n = 4;
            int cnt = 0;

            int rear = 0;
            int []arr = new int[n+1];
            void push(int x){
                if (cnt==n) {
                    System.out.println("Stack is full");
                    return;
                }
                rear++;
                arr[rear]=x;
                cnt++;
            }
            void pop(){
                cnt--;
                rear--;
            }
            void peek(){
                System.out.println(arr[rear]);
            }

    public static void main(String[] args) {

    }
}
