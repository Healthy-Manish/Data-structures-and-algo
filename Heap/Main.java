package Heap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws Exception {
        heap<Integer>h = new heap<>();
        h.insert(30);
        h.insert(70);
        h.insert(60);
        h.insert(23);
        h.insert(75);
        h.insert(11);
        h.remove();
        h.remove();
        ArrayList list = h.heapSort();
        System.out.println(list);

    }

}
