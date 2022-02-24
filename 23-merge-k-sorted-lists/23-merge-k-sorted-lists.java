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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) return null;
        
        return mergeKLists(lists, 0 , lists.length-1);
        
    }
    
    public ListNode mergeKLists(ListNode[] lists, int start, int end){
        if(start == end) return lists[start];
        
        int mid = start+(end-start)/2;
        ListNode left = mergeKLists(lists, start, mid);
        ListNode right = mergeKLists(lists, mid+1,end);
        
        return merge(left, right);
    }
    
    public ListNode merge(ListNode left, ListNode right){
        ListNode tmp = new ListNode(-1);
        ListNode result = tmp;
        while(left != null || right != null){
            if(right == null){
                result.next = left;
                left = left.next;
            }
            else if (left == null){
                result.next = right;
                right = right.next;
            }
            else if(left.val > right.val){
                result.next = right;
                right = right.next;
            }
            else{
                result.next = left;
                left = left.next;
            }
            result = result.next;
        }
        return tmp.next;
    }
}