package recursion;

public class Recursion_Pattern {
    public static void main(String[] args) {
        /*

        making pattern with the help of recursion
        * * * *
        * * *
        * *
        *

         */
        triangle(5,0);

    }
    static void reversetriangle(int r ,int c){
        if (r == 0){
            return;
        }
        if (c<r){
            System.out.print("* ");
            reversetriangle(r, c+1);
        }else {
            System.out.println();
            reversetriangle(r-1,0);
        }
    }

    static void triangle(int r ,int c){
        if (r == 0){
            return;
        }
        if (c<r){
            triangle(r, c+1);
            System.out.print("* ");

        }else {
            triangle(r-1,0);
            System.out.println();

        }
    }
}
