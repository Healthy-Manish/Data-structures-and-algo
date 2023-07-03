import java.util.Scanner;

public class typecasting04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float num = sc.nextInt();
        System.out.println(num);
        //above we see that float data type was able to take input in integer
        // this is called typeconversion where one data type is converted into another automatically
/* 
        int num1 = sc.nextFloat();
        System.out.println(num1);

        * above code will give error coz smaller data type can't be converted in larger
*/


//   In typecastig we compress one data tpe in other explicitly
    int num3 = (int)(79.456f);
    System.out.println(num3);

    // automatic type promotion in expression
    int a= 257;
    byte b = (byte)(a);
    System.out.println(b);//output is 257%256 = 1 as byte range is upto 256
    }

    
}
