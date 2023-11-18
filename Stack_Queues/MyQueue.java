package Stack_Queues;

import java.util.Stack;

//https://leetcode.com/problems/implement-queue-using-stacks/submissions/
class MyQueue {

    private Stack<Integer> first = new Stack<>();
    private  Stack<Integer> second = new Stack<>();

    public MyQueue() {

    }
    public void push(int x){
        if(first.isEmpty()){
            first.push(x);
            return ;
        }
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(x);
        while(!second.isEmpty()){
            first.push(second.pop());
        }
    }
    public int pop(){
        return first.pop();
    }
    public int peek(){
        return first.peek();
    }

    public boolean empty(){
        return first.isEmpty() && second.isEmpty();
    }
}