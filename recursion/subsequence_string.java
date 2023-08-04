package recursion;

public class subsequence_string {
    public static void main(String[] args) {
            subsets("","abc");
    }

    //printing subsequences of string
    static  void subsets(String str, String up){
        if (up.isEmpty()){
            System.out.println(str);
            return;
        }
        char ch = up.charAt(0);
        subsets(str+ch,up.substring(1));
        subsets(str,up.substring(1));
    }
}
