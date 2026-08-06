/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }

       ListNode current = head;
       int count = 0;
       while(current!=null){
         current=current.next;
         count++;
       }
       current = head;
       int pos = count - n;
       if (pos == 0) {
            return head.next;
        }
        
       for (int i = 0; i < pos - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
        return head;
    }
}