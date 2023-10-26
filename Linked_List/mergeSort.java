package Linked_List;

public class mergeSort {
    public  ListNode sortList(ListNode head){
        if(head== null || head.next == null){
            return head;
        }
        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return  merge(left,right);
    }
    ListNode merge(ListNode f, ListNode s){
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;

        while (f!=null && s!= null){
            if (f.value<s.value){
                tail.next = f;
                f = f.next;
                tail = tail.next;
            }
            else {
               tail.next = s;
               s = s.next;
               tail = tail.next;
            }
        }
      tail.next  = (f!=null)?f:s;
        return dummyHead.next;
    }
    ListNode getMid(ListNode head) {
        /*

          ListNode slow = head;
            ListNode fast = head;
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }
        return slow;

         */
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;

    }
    class ListNode {


        int value;
        ListNode next;
        public ListNode(){

        }
        public ListNode(int value) {
            this.value = value;
            next = null;
        }
        public ListNode(int value, ListNode next){
            this.value = value;
            this.next = next;
        }

    }
}
