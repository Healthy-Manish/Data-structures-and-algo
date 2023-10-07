package OOPS.staticExample;

import OOPS.staticExample.Human;

public class Main {


    public static void main(String[] args) {
        Human manish = new Human(22,"Manish",10000,false);
        Human Rahul = new Human(34,"Rahul",110000,false);
        Human Arpit = new Human(34,"Arpit",1160000,true);

        //whenever you access static variable don't access it via object name
        //convension is to access them via class name , it also work with object names but it is not convinience
        System.out.println(Human.population);
//        static method doesn't require object to run
        //A static method can only access static data
        //but a non-static method can access static data


    }
    static void fun(){
//        greeting();//you can't use this because it requires an instance
//        but the function you are using it in does not depend on instances

//        you cannot access non-static stuff without referencing theri instances in a static context
        Main obj = new Main();
        obj.greeting();
    }

    void greeting(){
        System.out.println("Hello world");
    }

}
