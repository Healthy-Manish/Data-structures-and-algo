package OOPS.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {
//    enums are public static and final
    enum Week{
        Monday,Tuesday,Wednesday,Thursday, Friday, Saturday, Sunday
}

    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();
        List<Integer>list2 = new LinkedList<>();
//        vectors in java
        List<Integer>vector = new Vector<>();
        vector.add(45);
        vector.add(5);
        vector.add(15);
        vector.add(345);
        Week week;
        week= Week.Monday;
        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
