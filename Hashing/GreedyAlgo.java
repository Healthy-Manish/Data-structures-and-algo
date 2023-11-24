package Hashing;
import java.util.*;
public class GreedyAlgo {
    public  static int calPoints(String[] operations) {
        Stack<Integer>st = new Stack<>();
        int sum  = 0;
        for(int i = 0;i<operations.length;i++){
            if(operations[i].equals("C")){
                st.pop();
            }
            else if (operations[i].equals("D")){
                st.push(st.peek()*2);
            }
            else if (operations[i].equals("+")){
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a+b);
            }
            else{
                int a = Integer.parseInt(operations[i]);
                st.push(a);
            }
        }
        while (!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        String[] ops = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(ops));
    }
}
