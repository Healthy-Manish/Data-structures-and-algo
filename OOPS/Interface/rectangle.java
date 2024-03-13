package OOPS.Interface;

import java.util.Scanner;

public class rectangle implements Shape{
    int l ;
    int b ;
    int a;
    @Override
    public void get_input() {
        System.out.println("enter length and breath of rectangle\n");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b= sc.nextInt();

    }

    @Override
    public void area() {
       a = l*b;
    }

    @Override
    public void display() {
         area();
        System.out.println("area of rectangle is "+a);
    }
}
