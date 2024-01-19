package OOPS.Interface;

public class Fish implements Predator,Prey{
    public void hunt(){
        System.out.println("This fish is hunting smaller fishes");
    }
    public void flee(){
        System.out.println("This fish is fleeing from a larger fish");
    }
}
