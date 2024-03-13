package OOPS.Interface;

import java.util.Scanner;

public class square implements Shape{
    int side;
    int a;
    @Override
    public void get_input() {
        System.out.println("enter side of square\n");
        Scanner sc = new Scanner(System.in);
        side = sc.nextInt();

    }

    @Override
    public void area() {
        a=side*side;
    }

    @Override
    public void display() {
        area();
        System.out.println("area of square is "+a);
    }
}
