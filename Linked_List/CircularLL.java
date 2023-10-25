package Linked_List;

public class CircularLL {
    private Node head;
    private Node tail;
    public CircularLL(){
        this.head = null;
        this.tail = null;
    }
    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display(){
        Node node = head;
        if(head!= null){
            do {
                System.out.print(node.val+"->");
                node= node.next;
            }
            while (node!= head);
            System.out.println("Head");
        }
    }
    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

//    deleting from a circular linked list

    public void delete(int val){
        Node node = head;
        if (node == null){
            return;
        }
        if (node.val == val){
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n= node.next;
            if (n.val ==val){
                node.next = n.next;
                break;
            }
            node= node.next;

        }
        while (node!=head);
    }
    public static void main(String[] args) {
        CircularLL list = new CircularLL();
        list.insert(23);
        list.insert(34);
        list.insert(53);
        list.insert(56);
        list.insert(76);
        list.display();
        list.delete(56);
        list.display();

    }
}
