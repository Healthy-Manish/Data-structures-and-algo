package MATHS_DSA;

public class Maths_in_DSA {

    /*
    Number systems

    1.Decimal => 0,1,2,3,4,5,6,7,8,9 base 10
    2.Binary => 0,1 base 2

    Left shift operator(<<):
    Important points => 1. a<<1 = 2a
                        2. a<<b = a*2^b
    Right shift operator (>>):
            1. a>>1 = a/2
            2. a>>b = a/2^b

     */
    public static void main(String[] args) {
        //Question: Given a number 'n' find if it is odd or even
        int n = 68;
        System.out.println(isOdd(n));

        //Question: find non-repeated number
        // arr = {2,3,4,1,2,1,3, 6, 4}
        //ans = 6  here we will xor all numbers in array

        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));

        //Question: Find i-th bit of a number
        // 10110110 here for i = 5 we will get output as 1

    }

    static boolean isOdd(int n){
        return (n &1)==1;
    }
    static int ans(int[] arr){
        int unique = 0;
        for (int n :arr){
            unique^=n;
        }
        return unique;
    }
}
