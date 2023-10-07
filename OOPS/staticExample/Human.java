package OOPS.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;//static variable are global variable that are same everywhere

    public  Human(int age, String name, int salary, boolean married){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population +=1;
    }

}
