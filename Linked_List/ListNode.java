package Linked_List;

import java.util.List;

public class ListNode {
     Node head;
     Node tail;
     int size;

    public ListNode() {
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
    public void insertRec(int val, int index){
        head = insertRec(val,index, head);
    }
    private Node insertRec(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val,node);
            size++;
            return temp;
        }
       node.next =  insertRec(val,index-1,node.next);
        return node;
    }

//    removing duplicates from linked list
    public void duplicates(){
        Node node = head;
        while (node.next!= null) {
            if (node.value == node.next.value) {
                node.next = node.next.next;
                size--;
            } else {
                node = node.next;
            }
        }
            tail= node;
            tail.next = null;

    }
//    Merging two sorted linked lists
    public static ListNode merge(ListNode first, ListNode second){
        Node f = first.head;
        Node s = second.head;
        ListNode ans = new ListNode();
        while (f!=null && s!= null){
            if (f.value<s.value){
                ans.insertLast(f.value);
                f = f.next;
            }
            else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f!= null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s!= null){
            ans.insertLast(s.value);
            s = s.next;
        }
    return ans;
    }
    public void  bubbleSort(){
        bubbleSort(size-1,0);
    }
    public void bubbleSort(int row,int col){
        if (row==0){
            return;
        }
        if (col<row){
            Node first = get(col);
            Node second = get(col+1);

            if (first.value> second.value){
//                swap
                if (first == head){
                    head = second;
                    first.next =second.next;
                    second.next =first;
                }
                else if(second==tail){
                    Node prev = get(col-1);
                    prev.next = second;
                    tail=first;
                    first.next = null;
                }
                else {
                    Node prev = get(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row,col+1);
        }
        else {
            bubbleSort(row-1,0);
        }

    }
//recurrsion reverse
    private  void reverse(Node  node){
        if (node==tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    public  void  reverse(){
        if (size<2)return;
        Node prev = null;
        Node present = head;
        Node next = present.next;
        while (present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null) {
                next = next.next;
            }

        }
        head = prev;
    }
    public Node reverseBetween(Node head, int left, int right) {
            if(left == right){
                return  head;
            }
//            skip the first left-1 node
             Node current = head;
             Node prev = null;
        for (int i = 0;current!=null &&  i < left-1; i++) {
                prev = current;
                current = current.next;
        }
        Node last = prev;
        Node newEnd = current;

//        reverse the list
        Node next = current.next;
        for (int i = 0; current!=null && i < right-left+1 ; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null) {
                next = next.next;
            }
        }
        if (last!= null){
            last.next = prev;
        }else{
            head = prev;
        }
        newEnd.next = current;

        return head;
    }

    public static void main(String[] args) {
//        practice LL  = new practice();
//        LL.insertLast(1);
//        LL.insertLast(1);
//        LL.insertLast(1);
//        LL.insertLast(2);
//        LL.insertLast(2);
//        LL.insertLast(3);
//        LL.insertLast(3);
//        LL.insertLast(3);
//        LL.display();
//        LL.duplicates();
//        LL.display();
        ListNode first = new ListNode();
        ListNode second = new ListNode();
        first.insertLast(1);
        first.insertLast(2);
        first.insertLast(3);
        first.insertLast(4);
        first.insertLast(6);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(5);
        second.insertLast(7);
        second.insertLast(8);
        second.insertLast(9);

       ListNode ans = ListNode.merge(first,second);
        System.out.println(ans.head.value);
        ans.reverse(ans.head);
        System.out.println(ans.head.value);

    }
}
