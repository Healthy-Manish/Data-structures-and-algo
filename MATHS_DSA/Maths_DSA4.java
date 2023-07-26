package MATHS_DSA;

public class Maths_DSA4 {
    //Find XOR of numbers from 0 to n
    public static void main(String[] args) {
        int n = 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.printf("After xor operation 0 to %d",n);
        System.out.println();
        System.out.println(Integer.toBinaryString(XOR_in_range(n)));
        System.out.println(XOR_range(3, 9));
    }
    //XOR from range 0 to n
    static int XOR_in_range(int n){
        if (n%4 == 0)return n;
        else if(n%4 == 1) return 1;
        else if(n%4 == 2)return n+1;

        return  0;
    }
    //XOR from range n to m
    static int XOR_range(int a, int b){
        return XOR_in_range(a-1)^XOR_in_range(b);
    }
}
