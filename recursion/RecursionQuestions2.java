package recursion;

public class RecursionQuestions2 {
    public static void main(String[] args) {
        int n =  1002004005;
        System.out.println(countZeros(n, 0));
    }
    //count zeros
    static int countZeros(int num, int c){

        if (num==0){
            return c;
        }
        int temp = num%10;
        if (temp==0)c++;
        return countZeros(num/10,c);

    }
}
