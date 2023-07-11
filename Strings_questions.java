
public class Strings_questions {
    public static void main(String[] args) {
        String str = "abccba";
        System.out.println(check_palindrome(str));
    }
    //checking for palindrome 
    static boolean check_palindrome(String str){
        int start = 0;
        int end = str.length()-1;
        while(end>=start){
            if(str.charAt(start)==str.charAt(end)){
                    start++;
                    end--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
