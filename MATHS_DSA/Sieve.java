package MATHS_DSA;

import java.util.Scanner;

public class Sieve {

    static int sz = 1000005;
    static boolean[] PrimeSieve = new boolean[1000005];
    static void buildSieve(){
        for (int i = 2; i <sz ; i++) {
            PrimeSieve[i] = true;
        }
            PrimeSieve[0]= false;
            PrimeSieve[1]= false;
        for (int i = 0; i*i <sz ; i++) {


            if (!PrimeSieve[i]){
                continue;
            }
            for (int j = 2; i*j <sz ; j++) {
                PrimeSieve[i * j] = false;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        buildSieve();
        System.out.println(PrimeSieve[check]);
    }
}
