package recursion;

public class string_recursion {
    public static void main(String[] args) {
            String up = "baccad";
            String skip = "baccapplead";
            String app = "baappsd";
            stringwithoutA("",up);
        System.out.println(skipString(skip));
        System.out.println(skipAppNotApple(skip));

    }
    //Print the string  without any 'a' in it
        static void stringwithoutA(String str,String up){
        if (up.isEmpty()){
            System.out.println(str);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a'){
            stringwithoutA(str,up.substring(1));
        }else{
            stringwithoutA(str+ch,up.substring(1));
        }

        }

        //skip  a string from the string "apple"
    static String  skipString(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("apple")){
            return skipString(up.substring(5));
        }else{
            return up.charAt(0)+skipString(up.substring(1));
        }

    }
//print the string where we skip "app" if it is not "apple"
    static String  skipAppNotApple(String up){
        if (up.isEmpty()){
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0)+skipAppNotApple(up.substring(1));
        }

    }

}
