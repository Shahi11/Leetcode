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
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode();
        ListNode ret = res;
        
        while(head.next != null){
        
            if(head.val == 0){ 
                int sum =0;
                head = head.next;
                while(head.val != 0){
                    sum += head.val;
                    head = head.next;
                }
                 ListNode tmp = new ListNode(sum);
                res.next = tmp;
                res = res.next;
                
            }
            
        }
        return ret.next;
    }
}