package OOPS;

public class StaticBlock {
//    this is a demo to show initialization of static variables
    static int a = 4;
    static int b;
    static {
//        this static run only once when the first obj is create i.e. when the class is loaded
        System.out.println("I am in static block");
        b=  a*5;

    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);
        StaticBlock.b +=3;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+ StaticBlock.b);

    }

}
