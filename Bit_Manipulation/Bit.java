package Bit_Manipulation;
import java.util.*;
import java .lang.*;
public class Bit {
    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<Integer>ans= new ArrayList();
        HashMap<String,Integer>map=new HashMap<>();
        for(int i= 0;i<dictionary.size();i++){
            String str = dictionary.get(i);


            char[] charArray = str.toCharArray();

            Arrays.sort(charArray);

            String dic = new String(charArray);
            dictionary.set(i, dic);
            if(map.containsKey(dic)){
                map.put(dic, map.get(dic)+1);
            }
            else map.put(dic, 1);

        }
        for (int i = 0; i < query.size(); i++) {
            String str = query.get(i);
            char[] charArray = str.toCharArray();

            Arrays.sort(charArray);

            String dic = new String(charArray);
            if(map.containsKey(dic)){
                ans.add(map.get(dic));
            }
            else ans.add(0);
        }


        return ans;
    }

    public static void main(String[] args) {
        List<String> word = new ArrayList<>(Arrays.asList("heater","cold","clod","reheat","docl"));
        List<String> query = new ArrayList<>(Arrays.asList("codl","heater","abcd"));
        System.out.println(stringAnagram(word,query));

    }

}


