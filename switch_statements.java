import java.util.Scanner;

public class switch_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        // if else statements

   /*      if(fruit.equals("Mango")){
                System.out.println("King of fruits");
        }
        if(fruit.equals("Apple")){
            System.out.println("Red sweet fruit");
        }       */

//  Here we can use switch statements for more clean code

        fruit = fruit.toLowerCase();// this function will change all char to lower
        switch (fruit) {
            case "mango":
                System.out.println("King of the fruits");
                break;
        
            case "apple":
            System.out.println("Sweet red fruit");
                break;
            
            case "orange":
            System.out.println("Round orange color fruit");

           
            default:
            System.out.println("please enter valid fruit");
        }
    }
}
