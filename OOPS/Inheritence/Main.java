package OOPS.Inheritence;

import OOPS.Inheritence.BOX;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
//        BOX box = new BOX(4.6,7.9,3);
//        BOX box2 = new BOX(box);
//        System.out.println(box.l+" "+box.h+" "+box.w);
//        System.out.println(box2.l+" "+box2.h+" "+box2.w);

//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(4.6,7.9,9.9,8);
//
//        System.out.println(box4.h+" "+box4.weight);
//
//        BOX box5 = new BoxWeight(2,3,4,8);
//        System.out.println(box5.weight);//this line will give error

//            this is because it is type of reference variable that determine which value can be accessed
//        type of object doesn't determine the members which can be accessed



//        BoxWeight box6 = new BOX(2,3,5);

//        there are many variables in both parent and child classes
//        you are given access to variables that are n the ref type i.e BoxWeight
//        hence you should have access to weight variable
//        this also means,that the ones you are trying to access should be initialized
//        but here when the obj itself is of type parent , how will you call constructor of child class
//        That's why error


        BoxPrice box = new BoxPrice(5,8,200);

    }

}
