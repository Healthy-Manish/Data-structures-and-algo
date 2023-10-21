package OOPS.clone;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human Manish= new Human(34,"Manish");
//        Human twin = new Human(Manish);
            Human twin = (Human)Manish.clone();
        System.out.println(twin.age);
        System.out.println(twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;
        System.out.println(Arrays.toString(Manish.arr));
        System.out.println(Arrays.toString(twin.arr));

    }


}
