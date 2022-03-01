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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        if(head == null || k ==1) return head;
        
        ListNode dum = new ListNode(0);
        dum.next = head;
        ListNode cur = dum, prev = dum, nxt = dum;
        
        int count = 0; 
        while(cur.next != null){
            cur = cur.next;
            count++;
        }
        
        while(count >= k){
            cur = prev.next;
            nxt = cur.next;
            for(int i = 1; i< k ; i++){
                cur.next = nxt.next;
                nxt.next = prev.next;
                prev.next = nxt;
                nxt = cur.next;
            }
            prev = cur;
            count -=k;
            
        }
        
        
        return dum.next;
        
    }
}