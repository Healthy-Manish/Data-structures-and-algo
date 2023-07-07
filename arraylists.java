import java.util.ArrayList;

public class arraylists {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        //arraylist doesn't have a definite size
        list.add(45);
        list.add(23);
        list.add(10);
        list.add(78);
        list.add(59);
        System.out.println(list);
        System.out.println(list.contains(78));//to check avaibility of item

        list.set(2, 1003);
        System.out.println(list);//to update any element

        list.remove(2);//to remove item
        System.out.println(list);

       System.out.println(list.get(2)); //to acces an index
    }
}
