/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        Node itr = head, front = head;
        
        while(itr != null){
            front = itr. next;
            
            Node tmp = new Node(itr.val);
            itr.next = tmp;
            tmp.next = front;
            
            itr = front;
        }
        
       
        itr = head;
        while(itr != null){
            if(itr.random != null){
                itr.next.random = itr.random.next; 
            }
              itr = itr.next.next;
        }
        
       
        itr = head;
        Node root = new Node(0);
        Node start = root;
        
        while(itr != null){
            front = itr.next.next;
            start.next = itr.next;
            itr.next = front;
            start = start.next;
            itr = itr.next;
        }
        
        return root.next;
        
    }
}