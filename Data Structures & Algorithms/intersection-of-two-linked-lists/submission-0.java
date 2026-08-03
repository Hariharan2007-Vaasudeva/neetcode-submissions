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
       if(headA == null && headB == null){
        return null;
       }       
       ListNode start = headA;
       ListNode end = headB;
       while(start != end){
        if(start == null){
            start = headB;
        }
        else{
            start = start.next;
        }
        if(end == null){
            end = headA;
        }
        else{
            end = end.next;
        }
       }
       return start;
    }
}