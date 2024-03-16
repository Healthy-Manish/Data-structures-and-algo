package Arrays_In_Java;

public class indexOfFirstOccrence {
    public static int strd(String haystack, String needle) {
        if(needle.isEmpty())return -1;
        int len = needle.length();
        for(int i = 0;i<=haystack.length()-len;i++){
            String temp = haystack.substring(i,i+len);
            if(temp.equals(needle))return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack ="a";
        String needle = "a";
        System.out.println(strd(haystack,needle));
    }
}
