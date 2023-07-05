import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        /*
        function(method) syntax in java:
            return_type name(){
                //body
                return statement;
            } 

         */
      //Q: take input of two numbers and print the sum

    //  sum();

    //  System.out.println(sum2());

      //accessing functions with arguments
    //   System.out.println(sum3(89, 35));

    swap(20, 30);
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = in.nextInt();

        System.out.println("Enter Second number:");
        int num2 = in.nextInt();
        System.out.println(num1+num2);
    }

    //return the value
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = in.nextInt();

        System.out.println("Enter Second number:");
        int num2 = in.nextInt();
        int sum = num1+num2;

        return sum;
    }
    static String greeting(){
            String message = "Good morning to the user";
        return message;
    }

    //fuctions with parameters 
    static int sum3 (int a, int b){
        int sum = a+b;
        return sum;
    }

    static void swap(int a, int b){
        int temp = a;
         a=b;
        b= temp;
        System.out.println("a = "+a+" b = "+b);
        
    }
}
