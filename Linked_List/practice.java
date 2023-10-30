package Linked_List;

public class practice {
    private Node head;
    private Node tail;
    private int size;

    public practice() {
        this.size = 0;
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size++;
    }
    public void insertLast(int val){
        if (tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
       size++;
    }
    public void insert(int val,int index){
        if (index==0){
            insertFirst(val);
            return;
        }
        if (index==size){
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


    public void deleteFirst(){
        head = head.next;
        if (head== null){
            tail=null;
        }
        size--;
    }
    public void deleteLast(){
        if (size<=1){
            deleteFirst();
            return;
        }
        Node secondlast = get(size-2);
        tail = secondlast;
        tail.next = null;

    }
    public Node get(int index){
        Node node = head;
        for (int i = 0; i <index ; i++) {
            node = node.next;
        }
        return node;
    }
    public Node getVal(int val){

        Node node = head;
       while (node!=null){
            if (node.value == val)return node;
            node = node.next;
        }
        return null;
    }
    public void deleteVal(int val){

        if (head.value == val){
            deleteFirst();
            return;
        }
        if (tail.value== val){
            deleteLast();
            return;
        }
        Node find = getVal(val);
        find.next = find.next.next;

    }
    public void deleteIndex(int ind){
        if (ind== 0){
            deleteFirst();
        }
        if (ind == size-1){
            deleteLast();
        }
        Node find = get(ind-1);
        find.next = find.next.next;
    }

    public void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp= temp.next;
        }
        System.out.println("End");
    }
    private class Node{
        int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public static void main(String[] args) {
        practice LL  = new practice();
        LL.insertFirst(23);
        LL.insertFirst(33);
        LL.insertFirst(2);
        LL.insertFirst(65);
        LL.insert(70,1);
        LL.display();
        LL.deleteLast();
        LL.display();
    }
}
