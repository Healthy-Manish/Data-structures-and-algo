package MATHS_DSA;

import java.math.BigInteger;

public class GCD {
    public static void main(String[] args) {
        int a = 20;
        int b = 10;

        BigInteger gcd = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));

        System.out.println(gcd);
    }
}
