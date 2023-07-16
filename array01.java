import java.util.Arrays;
import java.util.Scanner;

public class array01 {
    public static void main(String[] args) {
        //syntax of array
        // datatype[] variable_name = new datatype[size];

        //store 5 rollno.
        int[] rollno = new int[5];

        //or directly
        int[] rollno2 = {1,2,3,4,5};
        //******* All the element should be of same datatype in array
        // array object in java is not continious as it depend on JVM

        //input using length
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i<rollno.length;i++){
            rollno[i] = input.nextInt();
            
        }
//        System.out.println(Arrays.toString(rollno));
        System.out.println(rollno[2]);
        //if we try to acess index out of length then it will give error
    }

}
