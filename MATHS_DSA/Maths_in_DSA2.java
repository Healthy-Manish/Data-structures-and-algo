package MATHS_DSA;

public class Maths_in_DSA2 {

    public static void main(String[] args) {
        //find the n-th magic number for base 5
        int n = 6;
        int base = 5;
        int ans = 0;
        while (n>0){
            int last = n &1;
            n = n>>1;
            ans+= last*base;
            base = base*5;

        }
        System.out.println(ans);

        //Number of digit in a number system
        // ex -> for 6 in decimal it have 1 whereas in binary it has 3
        int num = 10;
        int b = 2;
        int final_ans= (int)(Math.log(num)/Math.log(b))+1;
        System.out.println(final_ans);
    }
}
