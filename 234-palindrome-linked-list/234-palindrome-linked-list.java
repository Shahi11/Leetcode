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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head, prev, temp;
        
        while (fast != null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        prev = slow;
        slow = slow.next;
        prev.next=null;
        while (slow != null){
            temp = slow.next;
            slow.next = prev;
            prev =slow;
            slow = temp;
        }
        
        fast = head;
        slow = prev;
        while (slow != null){
            if (slow.val != fast.val) return false;
            
            fast = fast.next;
            slow = slow.next;
        }
        return true;
        
    }
}