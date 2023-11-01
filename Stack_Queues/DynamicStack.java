package Stack_Queues;

public class DynamicStack extends customStack {
    public DynamicStack() {
        super();//it will call customStack()
    }
    public DynamicStack(int size) {
        super(size);//it will call customStack(size)
    }

    public  boolean push(int item){
        if (this.isFull()){
            //double the array size
            int[] temp = new int[data.length*2];
            //copy all previous items
            for (int i = 0; i <data.length ; i++) {
                temp[i]= data[i];
            }

            data = temp;
        }

        return super.push(item);
    }

    public static void main(String[] args) throws StackException{
        DynamicStack stack = new DynamicStack(5);
        stack.push(45);
        stack.push(5);
        stack.push(23);
        stack.push(89);
        stack.push(12);
        stack.push(34);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());



    }
}
