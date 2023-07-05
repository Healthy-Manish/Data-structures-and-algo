import java.util.Scanner;

public class Questions {
    //  here we have done some questions related to function

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  int n = sc.nextInt();
        //  System.out.println(isprime(n));

         System.out.println(Armstrong(33));
    }
// prime number
    static boolean isprime(int n){
            if(n<=1)return false;
            int c = 2;
            while (c*c<=n){
                if(n%c == 0)return false;

                c++;
            }
            if(c*c>n)return true;

            return false;
    }

    // Armstrong numbers
    static boolean Armstrong(int n){
        int original = n;
        int sum = 0;
        while(n>0){
             int rem = n%10;
             n = n/10;
             sum = sum+rem*rem*rem;

        }
        if(original==sum)return true;

        return false;
    }
}
