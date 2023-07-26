package MATHS_DSA;

public class Maths_DSA3 {
    /*
    pascals triangle
        1
        1 1
        1 2 1
        1 3 3 1
        1 4 6 4 1
        1 5 10 10 5 1

     */
    public static void main(String[] args) {
          /*
        check whether the number is power of 2
     */
        int n = 16;// Note -> fix for n = 0
        boolean ans =( n&(n-1)) == 0;

        System.out.println(ans);

        //calculate a^b
        int base = 3;
        int power = 6;
        int answ = 1;
        while (power>0) {
            if ((power & 1) == 1) {
                answ *= base;
            }
            base*=base;
            power = power>>1;
        }
        System.out.println(answ);

        //given number n ,find number of set bits
        int number = 35;
        int count = 0;
        System.out.println(Integer.toBinaryString(number));
        while (number>0){
            if((number&(-number))==1){
                count++;
            }
            number = number>>1;
        }

        System.out.println(count);
    }

}
