package Linked_List;

import org.w3c.dom.traversal.NodeIterator;

public class LL {

    private Node head;
    private Node tail;

    private int size;
    public LL(){
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){
        if (tail == null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val,int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if (index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for (int i = 1; i <index ; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }
    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.println("End");
    }
    public int deleteFirst(){
        int val = head.value;
        head= head.next;
        if (head == null){
            tail =null;
        }
        size--;
        return val;
    }
//    to delete from last
    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }
//   Deleting from a particular index
    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public int delete_val(int val){
        if (val == head.value){
            return deleteFirst();
        }
        if (val== tail.value)return deleteLast();
        Node prev = find(val);
        int value = prev.value;
        prev.next= prev.next.next;
        return value;
    }
//    deleting with value
    public Node find(int value){
        Node node = head;
        while (node!= null){
            if (node.next.value == value){
                return node;
            }
            node= node.next;
        }
        return null;
    }
   private  class Node{


       private int value;
       private Node next;

       public Node(int value) {
           this.value = value;
       }
       public Node(int value, Node next){
           this.value = value;
           this.next = next;
       }

   }
}
