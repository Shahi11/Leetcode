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
    public void reorderList(ListNode head) {
        
        if(head == null || head.next == null) return;
        
        ListNode fast = head, slow = head, back = null;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            back = slow;
            slow = slow.next;
        }
        
        back.next = null;
    
        ListNode prev = null;
        while(slow != null){
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }
        
        ListNode L1 = head;
        ListNode L2 = prev;
        while(L1 != null){
            ListNode l1 = L1.next;
            ListNode l2 = L2.next;
            L1.next = L2;
            if(l1 == null)
                break;
            L2.next = l1;
            L1 = l1;
            L2 = l2;
            
            
        }
        
        
        
    }
}