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
        ListNode temp = head;
        ListNode curr = head;
        int sz = 0;
        while(temp != null){
            sz += 1;
            temp = temp.next;
        }

        sz = sz - n; // 3
        if(sz == 0){
            return head.next;
        }
       
       for(int i =0; i < sz -1; i++){
        curr = curr.next;
       }
       if(curr != null && curr.next != null)
       {
            curr.next = curr.next.next ;
      
       }
        return head;
    }
}