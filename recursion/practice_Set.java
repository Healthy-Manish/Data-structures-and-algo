package recursion;

import java.util.ArrayList;
import java.util.List;

public class practice_Set {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        String input = "bacacadfgan";
        String applestring = "baapplexxd";
        System.out.println(remove(input,0,str));
        System.out.println(skip(applestring));

        List<String> list = new ArrayList<>();

        String test = "abc";

        subseq("",test,list);
        System.out.println(list);
        char ch = 'a';
        System.out.println(ch+0);//printing ascii value of characters
        int[]arr = {1,2,3};
        List<List<Integer>>ans = numSubseq(arr);
        System.out.println(ans);
    }

    //removing all 'a's from the string
    static StringBuilder remove(String input,int index,StringBuilder str){
        if (index == input.length())return str;
        if(input.charAt(index)!='a')str = str.append(input.charAt(index));

        return remove(input,index+1,str);
    }
    //if start with 'apple' skip apple in string
    static String skip(String input){
        if (input.isEmpty())return "";

        if (input.startsWith("apple")){
            return skip(input.substring(5));
        }
        else {
            return input.charAt(0)+ skip(input.substring(1));
        }

    }
// subset patterns
     static  List<String> subseq(String p, String up,List<String> list){//p=>proccessed up=>unproccessed
        if (up.isEmpty()){
//            System.out.println(p);
            if (!p.isEmpty()) {
                list.add(p);
            }

        }else {
            char ch = up.charAt(0);

            subseq(p + ch, up.substring(1), list);
            subseq(p, up.substring(1), list);
        }
        return list;
     }

// printing subsequnece in array
//    [1,2,3] => [1,2][2,3][1,2,3][1][2][3]
    static List<List<Integer>> numSubseq(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for ( int num: arr){
            int size = outer.size();
            for (int i = 0; i <size ; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
