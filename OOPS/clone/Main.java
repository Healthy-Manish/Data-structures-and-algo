package OOPS.clone;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human Manish= new Human(34,"Manish");
//        Human twin = new Human(Manish);
            Human twin = (Human)Manish.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
    }


}
