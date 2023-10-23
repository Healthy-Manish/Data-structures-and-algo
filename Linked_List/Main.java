package Linked_List;

public class Main {

    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.insertLast(99);
        list.insert(100,3);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.delete(2);
        list.display();
        list.insert(23,2);
        list.insert(34,2);
        list.display();
        list.delete_val(34);
        list.display();
    }
}
