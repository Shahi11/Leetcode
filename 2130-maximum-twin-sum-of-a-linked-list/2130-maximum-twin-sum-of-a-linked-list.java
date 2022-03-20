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
    public int pairSum(ListNode head) {
        ListNode fast = head, slow = head;
        
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        
        
        ListNode prev = null;
        while(slow != null){
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        slow = prev;
        
        int max = 0;
        
        while(slow != null){
            max = Math.max(max,slow.val+head.val);
            head = head.next;
            slow = slow.next;
        }
        
        return max;
    }
}