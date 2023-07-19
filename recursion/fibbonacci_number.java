package recursion;

public class fibbonacci_number {
    //0 1 1 2 3 5 8 13 --->fibonacci series
    public static void main(String[] args) {
        System.out.println(fib(6));
    }
    static int fib(int n){

        if (n<2)return n;
        return fib(n-1)+ fib(n-2);



    }
}
