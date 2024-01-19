package OOPS.Interface;

public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Hawk hawk = new Hawk();
        hawk.hunt();
        Fish shark = new Fish();
        shark.hunt();
    }
}

