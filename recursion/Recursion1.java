package recursion;

public class Recursion1 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        if (n==5) {
        return;        }
            System.out.println(n);

            print(n+1);

    }
}
