package OOP;

public class Main {
    public static void main(String[] args) {
//        Car myCar1 = new Car();
//        Car myCar2 = new Car();
//        System.out.println(myCar1.model);
//        System.out.println(myCar1.color);
//        System.out.println(myCar1.price);
//        myCar1.drive();
//        System.out.println(myCar2.model);
//        to make object of diffrent types we use constructor which is a class initializer

        Human human1 = new Human("Amisha",22,45.5,'F');
        Human human2 = new Human("Dinesh",12,27,'M');

//        human2.eat();
//        human1.eat();
//        human1.drink();
//        human2.drink();
//
        Car myCar = new Car();
        System.out.println(myCar.toString());
    }
}
