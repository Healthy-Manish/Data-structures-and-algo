package OOPS;

//import jdk.dynalink.Operation;


import java.util.ArrayList;

public class LambdaFunctions {
    int sum (int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(i+1);
        }
        arr.forEach(item -> System.out.println(item*2));
        Opearator sum= (a, b)->a+b;
        Opearator subtract= (a, b)-> a-b;
        Opearator mul= (a, b)-> a*b;
        LambdaFunctions calculator = new LambdaFunctions();
        System.out.println( calculator.operate(5,6,sum));


    }
private  int operate(int a, int b, Opearator op){
        return op.opearator(a,b);
}
}
interface Opearator {
    int opearator(int a, int b);
}
