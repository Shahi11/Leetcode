class LFUCache {

    int minfreq, currsize;
    final int capacity;
    Map<Integer, Node> cache;
    Map<Integer, DoubleLinkedList> freqMap;
    
    
    public LFUCache(int capacity) {
        this.capacity = capacity;
        currsize = 0;
        minfreq =0;
        cache = new HashMap<>();
        freqMap = new HashMap<>();
    }
    
    public int get(int key) {
        Node curr = cache.get(key);
        if(curr == null) return -1;
        
        updateNode(curr);
        return curr.val;
    }
    
    public void put(int key, int value) {
        if(capacity == 0) return;
        
        if(cache.containsKey(key)){
            Node curr = cache.get(key);
            curr.val = value;
            updateNode(curr);
        }
        
        else{
            currsize++;
            if(currsize > capacity){
                DoubleLinkedList mls = freqMap.get(minfreq);
                cache.remove(mls.tail.prev.key);
                mls.removeNode(mls.tail.prev);
            }
            minfreq = 1;
            Node temp = new Node(key, value);
            
            DoubleLinkedList tls = freqMap.getOrDefault(1,new DoubleLinkedList());
            tls.addNode(temp);
            freqMap.put(1,tls);
            cache.put(key,temp);
            
        }
    }
    
    public void updateNode(Node cur){
        int fr = cur.freq;
        DoubleLinkedList ls = freqMap.get(fr);
        ls.removeNode(cur);
        
        if(fr == minfreq && ls.size == 0)
            minfreq++;
        
        cur.freq++;
        DoubleLinkedList nl = freqMap.getOrDefault(cur.freq,new DoubleLinkedList());
        nl.addNode(cur);
        freqMap.put(cur.freq,nl);
    }
    

    
    class Node{
        Node next, prev;
        int key, val, freq;
        Node(int x, int y){
            key = x;
            val = y;
            freq = 1;
        }
    }
    
    class DoubleLinkedList{
        Node head, tail;
        int size;
        DoubleLinkedList(){
            head = new Node(0,0);
            tail = new Node(0,0);
            head.next = tail;
            tail.prev = head;
            size = 0;
        }
            public void addNode(Node curr){
        Node next = head.next;
        curr.next = next;
        next.prev = curr;
        head.next = curr;
        curr.prev = head;
        size++;
    }
    
    public void removeNode(Node curr){
        Node next = curr.next;
        Node prev = curr.prev;
        next.prev = prev;
        prev.next = next;
        size--;
    }
        
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */