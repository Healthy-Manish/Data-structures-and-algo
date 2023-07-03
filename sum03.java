import java.util.Scanner;

public class sum03 {
    public static void main(String[] args) {
        System.out.println("Enter the two Numbers :");
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int sum = n1+n2;
        System.out.println("sum of the numbers is "+sum);
    }
}
