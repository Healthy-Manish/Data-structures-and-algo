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



    }
    static boolean isOdd(int n){
        return (n &1)==1;
    }

}
