package OOP;

public class Car {

    String make = "Chevrolet";
    String model = "Corvette";
    int year = 2020;
    String color = "blue";
    double price = 50000.00;

    void drive(){
        System.out.println("You drive the car");
    }

    void breaks(){
        System.out.println("You step on the breaks");
    }

    public  String toString() {
        String myString ="["+ make +","+model+","+year+","+color+","+price+"]";
        return myString;

    }

}
