//  reverse a linked list 
class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode curr = head ;
        ListNode prev = null;

        while(curr!= null){
            ListNode currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currp1;
        }

            return prev;

    }

}
