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
            if (f.val <s.val){
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
    public ListNode reverseList(ListNode head){
        if ( head == null)return  head;
        ListNode prev = null;
        ListNode present = head;
        ListNode next = present.next;

        while (present!= null){
            present.next = prev;
            prev = present;
            present = next;
            if (next!=null)next = next.next;
        }
        return prev;
    }
//    check the list is palindrome
    public boolean isPalindrome(ListNode head) {
        ListNode mid = getMid(head);
        ListNode headSecond = reverseList(mid);
        ListNode reverseHead = headSecond;

//        compare both halves
         while (head != null || headSecond!=null){
             if (head.val!=headSecond.val){
                 break;
             }
             head = head.next;
             headSecond = headSecond.next;
         }
         reverseList(reverseHead);
         if (head==null || headSecond==null)return true;
         return false;
    }
    public void reorderList(ListNode head) {
        if (head == null|| head.next == null)return;
        ListNode mid =  getMid(head);
        ListNode hs = reverseList(mid);
        ListNode hf = head;
//        rearrange
        while (hf!= null&& hs != null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf  =temp;

            temp  = hs.next;
            hs.next = hf;
            hs = temp;

        }
        if (hf != null){
            hf.next = null;
        }
    }

    class ListNode {


        int val;
        ListNode next;
        public ListNode(){

        }
        public ListNode(int value) {
            this.val = value;
            next = null;
        }
        public ListNode(int value, ListNode next){
            this.val = value;
            this.next = next;
        }

    }
}
