package OOPS;

//Outside classes are not static because they are not dependend on any other classes

//class Test{
//    static String name;
//    public  Test(String name){
//        Test.name = name;
//    }
public class InnerClasses {
    static class Test {
         String name;

        public Test(String name) {
            this.name = name;
        }
    }


    public static void main(String[] args) {
            Test a = new Test("Manish");
            Test b = new Test("Aarti");
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
