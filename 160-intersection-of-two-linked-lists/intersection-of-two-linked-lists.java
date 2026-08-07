/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currentA = headA;
        ListNode currentB = headB;
        int count1=0;
        int count2=0;
        while(currentA!=null){
            currentA=currentA.next;
            count1++;
        }
        
        while(currentB!=null){
            currentB=currentB.next;
            count2++;
        }
        
        int pos = 0;
        currentA=headA;
        currentB=headB;
        if(count1>count2){
            pos=count1-count2;
            for(int i=0; i<pos; i++){
                currentA=currentA.next;
            }
        }else{
            pos=count2-count1;
            for(int i=0; i<pos; i++){
                currentB=currentB.next;
            }
        }

        while(currentA!=null && currentB!=null){
            if(currentA==currentB){
                return currentA;
            }

            currentA=currentA.next;
            currentB= currentB.next;
        }
        return null;
    }
}