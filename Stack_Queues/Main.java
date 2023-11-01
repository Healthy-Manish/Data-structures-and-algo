package Stack_Queues;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(56);
        stack.push(23);
        stack.push(87);
        stack.push(76);

//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        if you are removing element from a empty stack it will give exception error
//        EmptyStackException

        // Queue Data Structure
        Queue<Integer> queue = new LinkedList<>() ;
        queue.add(3);
        queue.add(4);
        queue.add(7);
        queue.add(6);
        queue.add(9);
        queue.add(10);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());

//        Doubly ended queue --> Deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(89);
        deque.addLast(78);
        deque.addFirst(34);
        deque.removeFirst();

    }
}
