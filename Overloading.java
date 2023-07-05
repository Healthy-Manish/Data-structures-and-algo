public class Overloading {
    public static void main(String[] args) {
//function overloading means when two function have same name but different argument that is known as function overloading

        func("manish");
        func(34);

    }
    static void func(int n){
        System.out.println(n);
    }

    static void func(String s){
           System.out.println(s);

    }
}
