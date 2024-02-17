package Stack_Queues;

import java.util.Stack;

public class ImplementQueueUsingStack {

    public ImplementQueueUsingStack(){

        }

    Stack<Integer> st1  =new Stack<>();
    Stack<Integer>st2 = new Stack<>();
    public void push(int x){
        while(!st2.empty()){
            st1.push(st2.pop());
        }
        st1.push(x);
        while (!st1.empty()){
            st2.push(st1.pop());
        }
    }
    public int pop(){
        return st2.pop();
    }
    public int peek(){
        return st2.peek();
    }
    public boolean empty(){
        return st2.empty();
    }

}
