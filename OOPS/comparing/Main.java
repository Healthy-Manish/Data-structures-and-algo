package OOPS.comparing;

public class Main {
//    comparing in objects of classes
    public static void main(String[] args) {
        Student manish = new Student(12,88.8f);
        Student rahul = new Student(12,85.8f);

        if (manish.compareTo(rahul)>0){
            System.out.println("Manish has more marks");
        }
    }
}
