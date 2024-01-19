import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class codeforces2 {

    public static void main(String[] args) {
       String[] word1 = {"ab", "c"};
       String[] word2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));

    }
    static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();


        for (String str : word1 ){
            st1.append(str);
        }
        for (String str : word2){
            st2.append(str);
        }
        System.out.println(st1.toString());
        System.out.println(st2.toString());
        return st1.toString().equals(st2.toString());
    }

}
