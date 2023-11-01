package Stack_Queues;

public class customStack {
    protected  int[] data;
    private  static  final  int DEFAULT_SIZE = 10;
    int ptr = -1;
    public customStack() {
        this(DEFAULT_SIZE);

    }
    public customStack(int size) {
       this.data = new int[size];

    }

    public  boolean push(int item){
        if (isFull()){
            System.out.println("Stack is full!!");
            return false;
        }


        ptr++;
        data[ptr] = item;
        return true;
    }
    public  int pop() throws  StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack!!");
        }

        int removed = data[ptr];
        ptr--;
        return  removed;

    }

    public  int peek() throws  StackException{
        if(isEmpty()){
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public   boolean isFull(){
        return ptr == data.length -1;
    }
    public  boolean isEmpty(){
        return ptr ==  -1;
    }

    public static void main(String[] args)  throws  StackException{
        customStack stack = new customStack(5);
        stack.push(45);
        stack.push(5);
        stack.push(23);
        stack.push(89);
        stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop());


    }
}
