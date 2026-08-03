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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode p = list1;
        ListNode q = list2;

        while(p != null && q != null){
            if(p.val <= q.val){
                cur.next = p;
                p = p.next;
            }
            else{
                cur.next = q;
                q = q.next;
            }
            cur = cur.next;
        }
        if(p != null){
            cur.next = p;
        }
        else{
            cur.next = q;
        }
        return dummy.next;
    }
}