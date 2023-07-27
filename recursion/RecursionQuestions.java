package recursion;

public class RecursionQuestions {

    public static void main(String[] args) {
        reverse(5);
        System.out.println(factorial(5));
        System.out.println(sum(5));
        System.out.println(sum_of_digit(42));
        System.out.println(product_of_digits(505));
        System.out.println(reverse_number(12384,0));
        System.out.println(check_palindrome(1));
        String s = "madaam";
        String s2 = reverse_String(s, "", s.length() - 1);
        System.out.println(s2);
        System.out.println(string_palindrome(s));


    }

    //printing numbers from n to 0
    static void reverse(int n) {
        if (n > 0) {
            System.out.println(n);
            reverse(n - 1);
        } else {
            return;
        }
    }

    static void sequence(int n) {
        if (n > 0) {
            sequence(n - 1);
            System.out.println(n);

        } else {
            return;
        }
    }

    //factorial of a number
    static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    //sum of n numbers
    static int sum(int n) {
        if (n == 1) return 1;

        return n + sum(n - 1);
    }

    static int sum_of_digit(int n) {
        int temp = n % 10;
        n = n / 10;

        if (n == 0) {
            return temp + 0;
        }
        return temp + sum_of_digit(n);

    }

    //product of digits
    static int product_of_digits(int n) {
        int temp = n % 10;
        n = n / 10;

        if (n == 0) {
            return temp * 1;
        }
        return temp * product_of_digits(n);

    }

    //reversing a number -->input 123  output-->321
    static int reverse_number(int num, int result) {
        if (num == 0) {
            return result;
        }
        result = result * 10 + num % 10;
        return reverse_number(num / 10, result);
    }

    static boolean check_palindrome(int n) {
        return (n == reverse_number(n, 0));
    }

    static String reverse_String(String s, String s2, int end) {
        if (end >= 0) {
            s2 = s2 + s.charAt(end);
            end--;
            return reverse_String(s, s2, end);

        }
        return s2;
    }
    static boolean string_palindrome(String s){
        String s2 = reverse_String(s,"", s.length()-1);
        return s.equals(s2);
    }
}
