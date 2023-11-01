package Stack_Queues;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(56);
        stack.push(23);
        stack.push(87);
        stack.push(76);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        if you are removing element from a empty stack it will give exception error
//        EmptyStackException

    }
}
