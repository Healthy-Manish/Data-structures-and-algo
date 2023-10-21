package OOPS.Exception_Handling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b= 0;

        try {
           divide(a,b);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always executue");
        }
    }
   static int divide(int a, int b){
        return a/b;
    }
}
