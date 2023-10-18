package OOPS.Polymorphism;

public class Main {
    public static void main(String[] args) {
        shapes shape = new shapes();
        circle circle = new circle();
        triangle triangle = new triangle();
        square square = new square();
        shape.area();
        circle.area();
        triangle.area();
    }

}
