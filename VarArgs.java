import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2,3,4,5,6,677,8);
    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
