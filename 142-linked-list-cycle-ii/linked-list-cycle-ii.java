/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        

        while(fast!=null  && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
           
           if(slow == fast){
                int count = 1;
                ListNode temp = slow;
                fast=fast.next;
                 while(fast!=temp){
                    fast=fast.next;
                    count++;
                }

            ListNode current = head;
            for(int i=0; i<count; i++){
                current=current.next;
            }

            while(head!=current){
                current=current.next;
                head = head.next;
                
            }

            return head;
           }
        }

        return null;
    }
}